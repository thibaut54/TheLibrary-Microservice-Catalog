package org.thibaut.thelibrary.service.impl;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import org.thibaut.thelibrary.repository.contract.RepositoryFactory;
import org.thibaut.thelibrary.repository.repository.UserRepository;

import javax.persistence.EntityManager;

@Component
@AllArgsConstructor
@Getter
@Setter
abstract class AbstractService {

	private final RepositoryFactory repositoryFactory;
	private final UserRepository userRepository;
	private final EntityManager em;

//	RepositoryFactory getRepositoryFactory( ) {
//		return repositoryFactory;
//	}
//
//	@Autowired
//	public void setRepositoryFactory( RepositoryFactory repositoryFactory ) {
//		this.repositoryFactory = repositoryFactory;
//	}
//
//	public EntityManager getEm( ) {
//		return em;
//	}
//
//	@Autowired
//	public void setEm( EntityManager em ) {
//		this.em = em;
//	}
}
