/**
 * 
 */
package com.bhuwan.spring.di.factoryinstance;

/**
 * @author bhuwan
 *
 */
public class CarFactory {

    public String carName;

    // static factory approach
    public Car getInstance() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Car) Class.forName(carName).newInstance();
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }
}
