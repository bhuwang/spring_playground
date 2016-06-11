/**
 * 
 */
package com.bhuwan.spring.di.factorymethod;

import java.util.Calendar;

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
        ApplicationContext context = new ClassPathXmlApplicationContext("factorymethod.xml");
        Test t = (Test) context.getBean("t");

        Calendar cal = (Calendar) context.getBean("cal");
        Calendar cal1 = (Calendar) context.getBean("cal");
        System.out.println(cal.getCalendarType());
        System.out.println(cal == cal1);

        TestStatic stat = (TestStatic) context.getBean("static");
        System.out.println(stat.printName());
        TestStatic stat1 = (TestStatic) context.getBean("static");
        System.out.println(stat == stat1);
    }

}
