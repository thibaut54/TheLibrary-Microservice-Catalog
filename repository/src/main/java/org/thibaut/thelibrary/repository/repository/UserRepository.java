package org.thibaut.thelibrary.repository.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.thibaut.thelibrary.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository< UserEntity, Integer >, QuerydslPredicateExecutor< UserEntity > {

	@Transactional
	UserEntity findByUserName( String username );

	@Transactional
	@Query( "SELECT user FROM UserEntity AS user JOIN  user.coordinates AS coordinates WHERE coordinates.email = :email" )
	UserEntity findByEmail( @Param( "email" ) String email );

}
