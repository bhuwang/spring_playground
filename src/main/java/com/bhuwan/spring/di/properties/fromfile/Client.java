/**
 * 
 */
package com.bhuwan.spring.di.properties.fromfile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author bhuwan
 *
 */
public class Client {

    /**
     * @param args
     */
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("driver_file.xml");
        Test demo = (Test) context.getBean("test");
        demo.printData();
    }

}
