package org.thibaut.thelibrary.repository.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.thibaut.thelibrary.entity.BookEntity;

@RepositoryRestResource(collectionResourceRel = "books", path = "books")
public interface BookRestRepository extends PagingAndSortingRepository < BookEntity, Long >{
}
