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
public class ClientByConstructor {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("autowire_constructor.xml");
        Bus bus = (Bus) ctx.getBean("bus");
        bus.printData();
    }
}
