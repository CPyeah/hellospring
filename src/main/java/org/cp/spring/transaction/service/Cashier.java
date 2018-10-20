package org.cp.spring.transaction.service;

import java.util.List;

public interface Cashier {
	
	void buyManyBooks(String userId, List<String> bookIdList);

}
