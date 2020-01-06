package org.thibaut.thelibrary.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.thibaut.thelibrary.service.contract.BookService;
import org.thibaut.thelibrary.service.contract.ServiceFactory;
import org.thibaut.thelibrary.service.contract.UserService;

@Component
@AllArgsConstructor
public class ServiceFactoryImpl implements ServiceFactory {

	private BookService bookService;
	private UserService userService;

	@Override
	public BookService getBookService( ) {
		return bookService;
	}

	@Override
	@Autowired
	public void setBookService( BookService bookService ) {
		this.bookService = bookService;
	}

	@Override
	public UserService getUserService( ) {
		return userService;
	}

	@Override
	@Autowired
	public void setUserService( UserService userService ) {
		this.userService = userService;
	}
}
