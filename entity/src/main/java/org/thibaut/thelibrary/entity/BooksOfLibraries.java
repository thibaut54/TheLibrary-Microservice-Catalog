package org.thibaut.thelibrary.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "books_of_libraries")
@Getter
@Setter
@EqualsAndHashCode
public class BooksOfLibraries {

	@EmbeddedId
	private BookLibraryId id;

	@ManyToOne
	@MapsId("bookId")
	private BookEntity book;

	@ManyToOne
	@MapsId("libraryId")
	private LibraryEntity library;

	private Integer stock;
}
