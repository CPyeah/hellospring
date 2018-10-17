package org.cp.hellospring;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.cp.spring.jdbc.Area;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

public class SpringJDBCTest {
	
	ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-jdbc.xml");
	DataSource dataSourse = (DataSource) ctx.getBean("mysqlDataSource");
	JdbcTemplate jdbcTemplate = (JdbcTemplate) ctx.getBean("jdbcTemplate");
	NamedParameterJdbcTemplate namedJdbcTemplate = (NamedParameterJdbcTemplate) ctx.getBean("namedjdbcTemplate");

	@Test
	public void test() throws SQLException {
		System.out.println(dataSourse.getConnection());
	}
	
	@Test
	public void testNamedInsert() {
		String sql = "insert into tb_area (area_name,priority)values(:name,:priority)";
		Map map = new HashMap();
		map.put("name", "江北");
		map.put("priority", 6);
		namedJdbcTemplate.update(sql, map);
	}
	
	@Test
	public void testNamedObjectInsert() {
		String sql = "insert into tb_area (area_name,priority)values(:name,:priority)";
		Area area = new Area();
		area.setName("江宁");
		area.setPriority(2);
		SqlParameterSource paramSource = new BeanPropertySqlParameterSource(area);
		namedJdbcTemplate.update(sql, paramSource);
	}
	
	@Test
	public void testInsert() {
		String sql = "insert into tb_area (area_name,priority)values(?,?)";
		jdbcTemplate.update(sql,"徐庄", 3);
	}
	
	@Test
	public void testBatchInsert() {
		String sql = "insert into tb_area (area_name,priority)values(?,?)";
		List<Object[]> batchArgs = new ArrayList<>();
		batchArgs.add(new Object[] {"河西", 2});
		batchArgs.add(new Object[] {"油坊桥", 1});
		batchArgs.add(new Object[] {"聚宝山", 6});
		jdbcTemplate.batchUpdate(sql, batchArgs);
	}
	
	@Test
	public void testAreaQry() {
		String sql = "select area_id id, area_name name, priority from tb_area where area_id=?";
		RowMapper<Area> rowMapper = new BeanPropertyRowMapper<>(Area.class);
		Area area = jdbcTemplate.queryForObject(sql, rowMapper,1);
		System.out.println(area);
	}
	
	@Test
	public void testAreaListQry() {
		String sql = "select area_id id, area_name name, priority from tb_area where area_id>?";
		RowMapper<Area> rowMapper = new BeanPropertyRowMapper<>(Area.class);
		List areaList = jdbcTemplate.query(sql, rowMapper,2);
		System.out.println(areaList);
	}
	
	@Test
	public void testAreaCountQry() {
		String sql = "select count(area_id) from tb_area";
		Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
		System.out.println(count);
	}

}
