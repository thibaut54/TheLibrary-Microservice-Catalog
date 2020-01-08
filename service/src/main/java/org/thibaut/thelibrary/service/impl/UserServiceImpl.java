package org.thibaut.thelibrary.service.impl;

import org.springframework.stereotype.Service;
import org.thibaut.thelibrary.entity.UserEntity;
import org.thibaut.thelibrary.repository.repository.RoleRepository;
import org.thibaut.thelibrary.repository.repository.UserRepository;
import org.thibaut.thelibrary.service.contract.UserService;

@Service
public class UserServiceImpl implements UserService {

	private RoleRepository roleRepository;
	private UserRepository userRepository;

	public UserServiceImpl( RoleRepository roleRepository, UserRepository userRepository ) {
		this.roleRepository = roleRepository;
		this.userRepository = userRepository;
	}

	@Override
	public UserEntity findByUserName( String username ) {
		UserEntity userEntity = userRepository.findByUserName( username );
		userEntity.setRoleList( roleRepository.getRolesByUsername( username ) );

		return userEntity;
	}


	@Override
	public UserEntity findByEmail( String email ) {
		UserEntity userEntity = userRepository.findByEmail( email );
		userEntity.setRoleList( roleRepository.getRolesByEmail( email ) );

		return userEntity;
	}
}
