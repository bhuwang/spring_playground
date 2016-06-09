/**
 * 
 */
package com.bhuwan.spring.di.collections.required;

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
        /**
         * While using schema based configuration you must have to use jee container and core container won't work.
         * 
         * But core container is working fine, need to analyze.
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("required.xml");
        // BeanFactory context = new XmlBeanFactory(new ClassPathResource("required.xml"));
        Test demo = (Test) context.getBean("test");
        demo.printData();
    }

}
