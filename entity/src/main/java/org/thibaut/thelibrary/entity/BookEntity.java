package org.thibaut.thelibrary.entity;

import lombok.*;
import org.joda.time.DateTime;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "book")
@Getter
@Setter
@Builder
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class BookEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	private String title;

	@ManyToMany
	@JoinTable(
			name = "categories_of_books",
			joinColumns = { @JoinColumn(name = "book_id") },
			inverseJoinColumns = { @JoinColumn(name = "category_id") } )
	private List< CategoryEntity > categorieList;

	private String language;

	private Long isbn;

	private DateTime publicationDate;

	private Integer numberOfPages;

	@ManyToMany(mappedBy = "bookList")
	private List< AuthorEntity > authorList;

	@ManyToMany
	@JoinTable(
			name = "books_of_libraries",
			joinColumns = { @JoinColumn(name = "book_id") },
			inverseJoinColumns = { @JoinColumn(name = "library_id") } )
	private List< LibraryEntity > librarieList;

	@ManyToOne
	@JoinColumn(name = "editor_id")
	private EditorEntity editor;

	@OneToMany(mappedBy = "book")
	private List< LoanEntity > loanList;


}
