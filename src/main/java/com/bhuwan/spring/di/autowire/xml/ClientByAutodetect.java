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
public class ClientByAutodetect {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("autowire_autodetect.xml");
        Bus bus = (Bus) ctx.getBean("bus");
        bus.printData();
    }
}
