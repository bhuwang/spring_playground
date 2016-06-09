/**
 * 
 */
package com.bhuwan.spring.di.mandatory;

import org.springframework.beans.factory.annotation.Required;

/**
 * @author bhuwan
 *
 */
public class Car {

    private String carName;
    private Engine engine;

    public Car() {
        System.out.println("Car object created......");
    }

    /**
     * @return the carName
     */
    public String getCarName() {
        return carName;
    }

    /**
     * @param carName
     *            the carName to set
     */
    @Required
    public void setCarName(String carName) {
        this.carName = carName;
    }

    /**
     * @return the engine
     */
    public Engine getEngine() {
        return engine;
    }

    /**
     * @param engine
     *            the engine to set
     */
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void printData() {
        System.out.println(carName);
        System.out.println(engine.getModelYear());
    }
}
