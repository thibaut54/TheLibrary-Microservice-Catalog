package org.thibaut.thelibrary.repository.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.thibaut.thelibrary.entity.AuthorEntity;

import java.util.List;

@Repository
public interface AuthorRepository extends JpaRepository< AuthorEntity, Integer >, QuerydslPredicateExecutor< AuthorEntity > {


	List< AuthorEntity > getAuthorsByFirstNameAndLastName( String firstName, String lastName );


	AuthorEntity getAuthorByFirstNameAndLastName( String firstName, String lastName );


	@Query(value = "SELECT a FROM Author AS a " +
		                "WHERE a.first_name=:firstName OR a.last_name=:firstName " +
                    "INTERSECT " +
                    "SELECT a FROM Author AS a " +
		                "WHERE a.first_name=:lastName OR a.last_name=:lastName",
			nativeQuery = true)
	AuthorEntity findAuthorByFirstNameAndLastName( @Param( "firstName" ) String firstName, @Param ( "lastName" ) String lastName );

}
