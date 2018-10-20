package org.cp.spring.transaction.dao;

import org.cp.spring.transaction.exception.BookStockException;
import org.cp.spring.transaction.exception.UserAccountException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("bookShop")
public class BookShopImpl implements BookShop {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int getBookPriceById(String bookId) {
		String sql = "select price from tb_book where id = ?";
		int bookPrice = jdbcTemplate.queryForObject(sql, Integer.class, bookId);
		return bookPrice;
	}

	@Override
	public void updateBookStock(String bookId) {
		String sql1 = "select stock from tb_book where id = ?";
		int stock = jdbcTemplate.queryForObject(sql1, Integer.class,bookId);
		if(stock<=0) {
			throw new BookStockException("库存不足");
		}
		
		String sql = "update tb_book set stock = stock-1 where id = ?";
		jdbcTemplate.update(sql, bookId);
	}

	@Override
	public void updateUserAccountBalance(String userId, int price) {
		String sql1 = "select balance from tb_user_account where id = ?";
		int balance = jdbcTemplate.queryForObject(sql1, Integer.class,userId);
		if(balance<price) {
			throw new UserAccountException("余额不足，请充值");
		}
		
		String sql = "update tb_user_account set balance = balance-? where id = ?";
		jdbcTemplate.update(sql, price, userId);

	}

}
