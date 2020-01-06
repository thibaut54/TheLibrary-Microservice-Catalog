package org.thibaut.thelibrary.repository.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;
import org.thibaut.thelibrary.entity.CategoryEntity;

@Repository
public interface CategoryRepository extends JpaRepository< CategoryEntity, Integer >, QuerydslPredicateExecutor< CategoryEntity > {
}
