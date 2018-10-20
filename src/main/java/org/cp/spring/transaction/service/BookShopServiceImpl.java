package org.cp.spring.transaction.service;

import org.cp.spring.transaction.dao.BookShop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Service("bookShopService")
public class BookShopServiceImpl implements BookShopService {
	
	@Autowired
	private BookShop bookShop;
	
	@Transactional(propagation=Propagation.REQUIRES_NEW,
			isolation=Isolation.READ_COMMITTED,
			readOnly=false,
			timeout=2)
	@Override
	public void buyOneBook(String userId, String bookId) {
		int bookPrice =  bookShop.getBookPriceById(bookId);
		
		bookShop.updateBookStock(bookId);
		
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		bookShop.updateUserAccountBalance(userId, bookPrice);

	}

}
