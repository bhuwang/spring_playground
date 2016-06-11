/**
 * 
 */
package com.bhuwan.spring.di.staticvariable;

/**
 * @author bhuwan
 *
 */
public class Car {

    private static String carName;

    public static void setCarName(String carName) {
        Car.carName = carName;
    }

    public static void printData() {
        System.out.println("carName: " + carName);
    }
}
