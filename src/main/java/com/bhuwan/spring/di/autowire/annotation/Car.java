/**
 * 
 */
package com.bhuwan.spring.di.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @author bhuwan
 *
 */
public class Car {

    private String carName;

    /*
     * in case of Autowired there is no need of setter or constructor
     * 
     */
    @Autowired
    @Qualifier(value = "engineB")
    private Engine engine;

    public void printData() {
        System.out.println("Car Name: " + carName);
        System.out.println("Engine model year: " + engine.getModelYear());
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public Engine getEngine() {
        return engine;
    }

}
