/**
 * 
 */
package com.bhuwan.spring.di.factorystatic;

/**
 * @author bhuwan
 *
 */
public class CarFactory {

    public static String carName;

    // static factory approach
    public static Car getInstance() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Car) Class.forName(carName).newInstance();
    }

    public static void setCarName(String carName) {
        CarFactory.carName = carName;
    }
}
