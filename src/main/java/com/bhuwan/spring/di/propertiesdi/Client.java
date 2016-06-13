/**
 * 
 */
package com.bhuwan.spring.di.propertiesdi;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author bhuwan
 *
 */
public class Client {

    /**
     * @param args
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        ApplicationContext context = new ClassPathXmlApplicationContext("propertiesdi.xml");
        Test demo = (Test) context.getBean("con");
        demo.createConnection();
    }

}
