/**
 * 
 */
package com.bhuwan.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author bhuwan
 *
 */
public class Client {

    public static void main(String[] args) {
        // Resource r = new ClassPathResource("spring.xml");
        // BeanFactory : Lazy Loading
        // BeanFactory factory = new XmlBeanFactory(r);

        // Application context : Eager loading - Recommended way of loading classes
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Test t1 = context.getBean(Test.class);
        // Test t1 = (Test) factory.getBean("t");
        Test t2 = (Test) context.getBean(Test.class);
        Test t3 = (Test) context.getBean(Test.class);
        if (t1 == t2 && t1 == t3) {
            // by default the object scope is singleton
            System.out.println("Singleton Scope....");
            System.out.println("t1 t2 and t3, all are pointing to same object reference.");
        } else {
            // if you define singleton=false [ie. object scope will be prototype] in spring.xml this block will be executed.
            System.out.println("Prototype Scope....");
            System.out.println("t1 t2 and t3, all are individual objects.");
        }
        t1.hello();

        NameAndGender c = (NameAndGender) context.getBean(NameAndGender.class);
        c.sayHello("Bhuwan Gautam");
    }

}
