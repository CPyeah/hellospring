package org.cp.hellospring.annotation.service;

import org.cp.hellospring.annotation.repository.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseService<T> {
	
	@Autowired
	BaseRepository<T> baseRepository;
	
	public void add() {
		System.out.println("BaseService add...");
		System.out.println(baseRepository);
	}

}
