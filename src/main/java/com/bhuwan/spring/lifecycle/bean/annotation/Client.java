/**
 * 
 */
package com.bhuwan.spring.lifecycle.bean.annotation;

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
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("lifecycle_bean_annotation.xml");
        Test test = (Test) context.getBean("test");
        test.saveData("Prasidhi Pandit", "prasidhi@gmail.com", "Sanepa, Kathmandu");
        // once you call this close method, then the lifecycle destroy method will be invoked.
        context.close();
    }
}
