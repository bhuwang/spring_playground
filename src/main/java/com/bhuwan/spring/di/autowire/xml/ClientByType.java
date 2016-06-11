/**
 * 
 */
package com.bhuwan.spring.di.autowire.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author bhuwan
 *
 */
public class ClientByType {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("autowire_bytype.xml");
        Car car = (Car) ctx.getBean("c");
        car.printData();
    }
}
