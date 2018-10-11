package org.cp.hellospring.annotation.service;

import org.cp.hellospring.annotation.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	@Qualifier("userJDBCRepositoryImpl")
	UserRepository userRepository;

	public void add() {
		System.out.println("UserService Add...");
		userRepository.save();
	}
}
