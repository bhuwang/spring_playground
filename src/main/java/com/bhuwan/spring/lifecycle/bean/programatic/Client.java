/**
 * 
 */
package com.bhuwan.spring.lifecycle.bean.programatic;

import java.sql.SQLException;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author bhuwan
 *
 */
public class Client {

    /**
     * @param args
     * @throws SQLException
     */
    public static void main(String[] args) throws SQLException {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("lifecycle_bean_programatic.xml");
        Test test = (Test) context.getBean("test");
        test.saveData("Suman Bhandari", "suman@gmail.com", "Dang");
        // once you call this close method, then the lifecycle destroy method will be invoked.
        context.close();
    }
}
