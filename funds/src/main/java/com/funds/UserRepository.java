package com.funds;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer>{
	
	User findByUsernameAndPassword(String userName, String userPassword);

}
