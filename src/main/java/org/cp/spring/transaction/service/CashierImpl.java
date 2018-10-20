package org.cp.spring.transaction.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("cashier")
public class CashierImpl implements Cashier {
	
	@Autowired
	BookShopService bookShopService;

	@Transactional
	@Override
	public void buyManyBooks(String userId, List<String> bookIdList) {
		for(String bookId : bookIdList) {
			bookShopService.buyOneBook(userId, bookId);
		}
	}

}
