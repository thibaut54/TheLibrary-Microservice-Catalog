package org.thibaut.thelibrary.repository.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;
import org.thibaut.thelibrary.entity.BooksOfLibraries;

@Repository
public interface BooksOfLibrariesRepository extends JpaRepository< BooksOfLibraries, Integer >, QuerydslPredicateExecutor<BooksOfLibraries> {
}
