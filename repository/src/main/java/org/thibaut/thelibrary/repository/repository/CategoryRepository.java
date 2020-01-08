package org.thibaut.thelibrary.repository.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.thibaut.thelibrary.entity.CategoryEntity;

@Repository
public interface CategoryRepository extends JpaRepository< CategoryEntity, Long > {
}
