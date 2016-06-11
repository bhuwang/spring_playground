/**
 * 
 */
package com.bhuwan.spring.di.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author bhuwan
 *
 */
public class Client {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowire_annotation.xml");
        Car c = (Car) context.getBean("c");
        c.printData();
    }
}
