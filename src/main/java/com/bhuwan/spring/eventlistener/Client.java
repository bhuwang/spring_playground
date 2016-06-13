/**
 * 
 */
package com.bhuwan.spring.eventlistener;

import org.springframework.context.ConfigurableApplicationContext;
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
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("eventlistener.xml");
        context.start();
        context.stop();
        context.close();
        context.refresh();
    }

}
