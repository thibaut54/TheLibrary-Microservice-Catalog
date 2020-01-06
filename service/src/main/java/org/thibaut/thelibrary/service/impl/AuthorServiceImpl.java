package org.thibaut.thelibrary.service.impl;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.thibaut.thelibrary.entity.AuthorEntity;
import org.thibaut.thelibrary.repository.contract.RepositoryFactory;
import org.thibaut.thelibrary.repository.repository.UserRepository;
import org.thibaut.thelibrary.service.contract.AuthorService;

import javax.persistence.EntityManager;
import java.util.List;

@Component
public class AuthorServiceImpl extends AbstractService implements AuthorService {

	public AuthorServiceImpl( RepositoryFactory repositoryFactory, UserRepository userRepository, EntityManager em ) {
		super( repositoryFactory, userRepository, em );
	}

	@Override
	public List< AuthorEntity > getAuthorByLastNameAndFirstName( String lastName, String firstName ){

		return getRepositoryFactory().getAuthorRepository().getAuthorsByFirstNameAndLastName( firstName, lastName );
	}


	public AuthorEntity findAuthorByFirstNameAndLastName( Pageable pageable, String firstName, String lastName ){

		/*int pageSize = pageable.getPageSize();
		int currentPage = pageable.getPageNumber();
		int startItem = currentPage * pageSize;

		QAuthor qAuthor = QAuthor.author;

		BooleanBuilder booleanBuilder = new BooleanBuilder();

		if( ! firstName.equals( "" )){
			booleanBuilder
					.and( qAuthor.firstName.containsIgnoreCase( firstName ) )
					.or( qAuthor.lastName.containsIgnoreCase( firstName) );
		}
		if( ! lastName.equals( "" )){
			booleanBuilder
					.and( qAuthor.firstName.containsIgnoreCase( lastName ) )
					.or( qAuthor.lastName.containsIgnoreCase( lastName) );
		}*/
		return null;
	}
}
