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
     * qualifier not working in this case.
     */
    @Qualifier("engineB")
    @Autowired
    private Engine engine;

    public void printData() {
        System.out.println("Car Name: " + carName);
        System.out.println("Engine model year: " + engine.getModelYear());
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

}
