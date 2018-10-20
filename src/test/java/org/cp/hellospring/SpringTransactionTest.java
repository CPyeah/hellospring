package org.cp.hellospring;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.cp.spring.transaction.dao.BookShop;
import org.cp.spring.transaction.service.BookShopService;
import org.cp.spring.transaction.service.Cashier;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTransactionTest {
	
	ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-jdbc.xml");
	
	BookShop bookShop = (BookShop) ctx.getBean("bookShop");
	BookShopService bookShopService = (BookShopService) ctx.getBean("bookShopService");
	Cashier cashier = (Cashier) ctx.getBean("cashier");
	
	@Test
	public void buyManyBooksTest() {
		
		List<String> bookIdList = Arrays.asList("1","2");
		
		cashier.buyManyBooks("1001", bookIdList);
	}
	
	
	@Test
	public void buyOneBookTest() {
		bookShopService.buyOneBook("1001", "1");
	}
	
	@Test
	public void getBookPriceByIdTest() {
		int price = bookShop.getBookPriceById("1");
		System.out.println(price);
	}
	
	@Test
	public void updateBookStockTest() {
		bookShop.updateBookStock("1");
	}
	
	@Test
	public void updateUserAccountBalanceTest() {
		int price = bookShop.getBookPriceById("1");
		bookShop.updateUserAccountBalance("1001",price);
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
