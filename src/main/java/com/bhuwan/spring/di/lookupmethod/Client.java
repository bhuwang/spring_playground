/**
 * 
 */
package com.bhuwan.spring.di.lookupmethod;

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
        ApplicationContext context = new ClassPathXmlApplicationContext("lookup.xml");

        System.out.println("----------------car---------------------------");
        // for car interface
        Car car = (Car) context.getBean("car");
        System.out.println(car.getClass().getName());
        System.out.println(car.myCarEngine().getEngineName());

        System.out.println("----------------bus---------------------------");
        // for bus abstract class
        Bus bus = (Bus) context.getBean("bus");
        System.out.println(bus.getClass().getName());
        System.out.println(bus.myBusEngine().getEngineName());

        System.out.println("----------------truck---------------------------");
        // for bus abstract class
        Truck truck = (Truck) context.getBean("truck");
        System.out.println(truck.getClass().getName());
        System.out.println(truck.myTruckEngine().getEngineName());
    }
}
