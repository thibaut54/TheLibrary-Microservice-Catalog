package org.thibaut.thelibrary.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "book")
@Getter
@Setter
@EqualsAndHashCode
public class BookEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String title;

	@ManyToMany
	@JoinTable(
			name = "categories_of_books",
			joinColumns = { @JoinColumn(name = "book_id") },
			inverseJoinColumns = { @JoinColumn(name = "category_id") } )
	private List< CategoryEntity > categories;

	private String language;
	private Integer isbn;
	private LocalDate publicationDate;
	@Column(name = "number_of_pages")
	private Integer numberOfPages;

	@ManyToMany(mappedBy = "books")
	private List< AuthorEntity > authors;

	@ManyToMany
	@JoinTable(
			name = "books_of_libraries",
			joinColumns = { @JoinColumn(name = "book_id") },
			inverseJoinColumns = { @JoinColumn(name = "library_id") } )
	private List< LibraryEntity > libraries;

	@ManyToOne
	@JoinColumn(name = "editor_id")
	private EditorEntity editor;

	@OneToMany(mappedBy = "book")
	private List< LoanEntity > loans;


}//end BookEntity
