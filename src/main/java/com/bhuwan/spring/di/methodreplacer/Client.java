/**
 * 
 */
package com.bhuwan.spring.di.methodreplacer;

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
        ApplicationContext context = new ClassPathXmlApplicationContext("methodreplacer.xml");
        Bank bank = (Bank) context.getBean("bank");
        System.out.println(bank.getClass().getCanonicalName());
        bank.deposit();
        bank.withdraw();
        bank.calculateInterest();
    }
}
