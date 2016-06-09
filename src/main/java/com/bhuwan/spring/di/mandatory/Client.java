/**
 * 
 */
package com.bhuwan.spring.di.mandatory;

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
        ApplicationContext context = new ClassPathXmlApplicationContext("mandatory.xml");
        Car car = (Car) context.getBean("car");
        car.printData();
    }

}
