package org.thibaut.thelibrary.service.impl;

import org.springframework.stereotype.Service;
import org.thibaut.thelibrary.entity.UserEntity;
import org.thibaut.thelibrary.repository.contract.RepositoryFactory;
import org.thibaut.thelibrary.repository.repository.RoleRepository;
import org.thibaut.thelibrary.repository.repository.UserRepository;
import org.thibaut.thelibrary.service.contract.UserService;

import javax.persistence.EntityManager;

@Service
public class UserServiceImpl extends AbstractService implements UserService {

	private RoleRepository roleRepository;

	public UserServiceImpl(
			RepositoryFactory repositoryFactory,
			UserRepository userRepository,
			EntityManager em,
			RoleRepository roleRepository) {
		super( repositoryFactory, userRepository, em );
		this.roleRepository = roleRepository;
	}

	@Override
	public UserEntity findByUserName( String username ) {
		UserEntity userEntity;
		userEntity = getRepositoryFactory( ).getUserRepository( ).findByUserName( username );
//			userEntity.setRoles( getRepositoryFactory().getRoleRepository().findRoleByUserName( userEntity.getUserName() ) );
		userEntity.setRoles( roleRepository.getRolesByUsername( username ) );

		return userEntity;
	}


	@Override
	public UserEntity findByEmail( String email ) {
		UserEntity userEntity;
		userEntity = getRepositoryFactory( ).getUserRepository( ).findByEmail( email );
//			userEntity.setRoles( getRepositoryFactory().getRoleRepository().findRoleByEmail( email ) );
		userEntity.setRoles( roleRepository.getRolesByEmail( email ) );

		return userEntity;
	}
}
