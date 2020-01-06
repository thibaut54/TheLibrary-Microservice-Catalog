package org.thibaut.thelibrary.service.contract;

import org.thibaut.thelibrary.entity.BookEntity;

import java.util.List;

public interface BookService {

	String getBookTitle( Integer id );

	BookEntity getBookById( Integer id );

	List< BookEntity > getBookByTitle( String title );
}
