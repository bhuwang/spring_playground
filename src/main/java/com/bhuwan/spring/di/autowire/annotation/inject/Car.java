/**
 * 
 */
package com.bhuwan.spring.di.autowire.annotation.inject;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @author bhuwan
 *
 */
public class Car {

    private String carName;

    /*
     * in case of Inject it will autowire DI by using type
     * 
     */
    @Inject
    @Qualifier("engineb")
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
