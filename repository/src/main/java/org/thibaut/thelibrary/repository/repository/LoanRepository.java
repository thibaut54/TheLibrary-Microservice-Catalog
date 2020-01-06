package org.thibaut.thelibrary.repository.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;
import org.thibaut.thelibrary.entity.LoanEntity;

@Repository
public interface LoanRepository extends JpaRepository< LoanEntity, Integer >, QuerydslPredicateExecutor< LoanEntity > {
}
