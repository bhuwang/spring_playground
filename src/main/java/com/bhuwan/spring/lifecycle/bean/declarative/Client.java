/**
 * 
 */
package com.bhuwan.spring.lifecycle.bean.declarative;

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
        // ConfigurableApplicationContext can handles lifecycle of bean
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("lifecycle_bean_declarative.xml");
        Test test = (Test) context.getBean("test");
        Test2 test2 = (Test2) context.getBean("test2");
        Test3 test3 = (Test3) context.getBean("test3");
        test.saveData("Sapana Malla", "sapana@gmail.com", "Kathmandu");
        // once you call this close method, then the lifecycle destroy method will be invoked.
        context.close();
    }
}
