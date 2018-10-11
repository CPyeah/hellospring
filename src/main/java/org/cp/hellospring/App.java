package org.cp.hellospring;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello spring!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException
    {
        System.out.println( "Hello Spring!" );
        
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("SpringBeans.xml");
        Person tom = (Person) ac.getBean("tom");
//        Person tom4class = ac.getBean(Person.class);
        System.out.println(tom.toString());
//        System.out.println(tom4class);
        
        Car benz = (Car) ac.getBean("benz");
        System.out.println(benz.toString());
        Car audi = (Car) ac.getBean("audi");
        System.out.println(audi);
        
        Boss cp = (Boss) ac.getBean("cp");
        System.out.println(cp.toString());
        
        CEO laowang = (CEO) ac.getBean("laowang");
        System.out.println(laowang.toString());
        
        CTO xiaojiang = (CTO) ac.getBean("xiaogiang");
        System.out.println(xiaojiang.toString());
        
        DataSource dataSource = ac.getBean(DataSource.class);
        System.out.println(dataSource.toString());
        
        CEO laoli = (CEO) ac.getBean("laoli");
        System.out.println(laoli.toString());
        
        Boss laochen = (Boss) ac.getBean("laochen");
        System.out.println(laochen);
        
        Person man = (Person) ac.getBean("man");
        System.out.println(man);
        
        Boss lovecar = (Boss) ac.getBean("lovecar");
        System.out.println(lovecar);
        
        Car bmw1 = (Car) ac.getBean("bmw");
        Car bmw2 = (Car) ac.getBean("bmw");
        System.out.println("bmw1=bmw2   is  "+ (bmw1==bmw2));
        
//        javax.sql.DataSource mysqlDataSource = (javax.sql.DataSource) ac.getBean("mysqlDataSource");
//        System.out.println(mysqlDataSource.getConnection());
        
        Car dazhong = (Car) ac.getBean("dazhong");
        System.out.println(dazhong);
        
        Boss xiaolaoban = (Boss) ac.getBean("xiaolaoban");
        System.out.println(xiaolaoban);
        
        Dog herry = (Dog) ac.getBean("herry");
        System.out.println(herry);
       
//        ac.close();
        
        Pen hero = (Pen) ac.getBean("hero");
        System.out.println(hero);
        Pen lamy = (Pen) ac.getBean("lamy");
        System.out.println(lamy);
        Pen ck = (Pen) ac.getBean("ck");
        System.out.println(ck);
        		
    }
}
