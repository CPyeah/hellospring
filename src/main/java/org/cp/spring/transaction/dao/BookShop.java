package org.cp.spring.transaction.dao;

public interface BookShop {
	
	int getBookPriceById(String bookId);
	
	void updateBookStock(String bookId);
	
	void updateUserAccountBalance(String userId, int price);

}
