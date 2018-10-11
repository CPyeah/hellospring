package org.cp.hellospring.annotation.repository;

import org.springframework.stereotype.Repository;

@Repository
public class UserJDBCRepositoryImpl implements UserRepository {

	@Override
	public void save() {
		System.out.println("UserJDBCRepositoryImpl Save...");
	}

}
