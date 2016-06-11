/**
 * 
 */
package com.bhuwan.spring.di.stereotype.component;

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
        ApplicationContext context = new ClassPathXmlApplicationContext("stereotype.xml");
        Car car = (Car) context.getBean(Car.class);
        car.printData();
    }

}
