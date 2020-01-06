package org.thibaut.thelibrary.repository.contract;

import org.springframework.beans.factory.annotation.Autowired;
import org.thibaut.thelibrary.repository.repository.*;

public interface RepositoryFactory {

	BookRepository getBookRepository( );

	@Autowired
	void setBookRepository( BookRepository bookRepository );

	AuthorRepository getAuthorRepository( );

	void setAuthorRepository( AuthorRepository authorRepository );

	CategoryRepository getCategoryRepository( );

	void setCategoryRepository( CategoryRepository categoryRepository );

	UserRepository getUserRepository( );

	void setUserRepository( UserRepository userRepository );

	RoleRepository getRoleRepository( );

	void setRoleRepository( RoleRepository roleRepository );
}
