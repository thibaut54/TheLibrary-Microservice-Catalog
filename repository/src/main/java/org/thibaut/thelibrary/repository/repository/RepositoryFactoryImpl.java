package org.thibaut.thelibrary.repository.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.thibaut.thelibrary.repository.contract.RepositoryFactory;

@Component
public class RepositoryFactoryImpl implements RepositoryFactory {

	private BookRepository bookRepository;
	private AuthorRepository authorRepository;
	private CategoryRepository categoryRepository;
	private UserRepository userRepository;
	private RoleRepository roleRepository;

	@Override
	public BookRepository getBookRepository( ) {
		return bookRepository;
	}

	@Override
	@Autowired
	public void setBookRepository( BookRepository bookRepository ) {
		this.bookRepository = bookRepository;
	}

	@Override
	public AuthorRepository getAuthorRepository( ) {
		return authorRepository;
	}

	@Override
	@Autowired
	public void setAuthorRepository( AuthorRepository authorRepository ) {
		this.authorRepository = authorRepository;
	}

	@Override
	public CategoryRepository getCategoryRepository( ) {
		return categoryRepository;
	}

	@Override
	@Autowired
	public void setCategoryRepository( CategoryRepository categoryRepository ) {
		this.categoryRepository = categoryRepository;
	}

	@Override
	public UserRepository getUserRepository( ) {
		return userRepository;
	}

	@Override
	@Autowired
	public void setUserRepository( UserRepository userRepository ) {
		this.userRepository = userRepository;
	}


	@Override
	public RoleRepository getRoleRepository( ) {
		return roleRepository;
	}

	@Override
	@Autowired
	public void setRoleRepository( RoleRepository roleRepository ) {
		this.roleRepository = roleRepository;
	}
}
