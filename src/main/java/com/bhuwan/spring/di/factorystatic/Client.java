/**
 * 
 */
package com.bhuwan.spring.di.factorystatic;

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
        ApplicationContext context = new ClassPathXmlApplicationContext("factorystatic.xml");
        Car car = (Car) context.getBean("cf");
        car.drive();
    }
}
