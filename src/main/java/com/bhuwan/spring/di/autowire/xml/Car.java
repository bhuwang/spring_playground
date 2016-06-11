/**
 * 
 */
package com.bhuwan.spring.di.autowire.xml;

/**
 * @author bhuwan
 *
 */
public class Car {

    private String carName;
    private Engine engine;

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
        System.out.println("Car Name: " + carName);
        System.out.println("Engine model year: " + engine.getModelYear());
    }

}
