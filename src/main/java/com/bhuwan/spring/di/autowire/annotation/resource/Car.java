/**
 * 
 */
package com.bhuwan.spring.di.autowire.annotation.resource;

import javax.annotation.Resource;

/**
 * @author bhuwan
 *
 */
public class Car {

    private String carName;

    /*
     * in case of Resource it will autowire DI by using name
     * 
     */
    @Resource
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
