package org.thibaut.thelibrary.service.contract;

import org.thibaut.thelibrary.entity.UserEntity;

public interface UserService {

	UserEntity findByUserName( String username ) throws Exception;

	UserEntity findByEmail( String email ) throws Exception;
}
