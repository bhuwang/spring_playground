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
public class ClientByName {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("autowire_byname.xml");
        Car car = (Car) ctx.getBean("car");
        car.printData();
    }
}
