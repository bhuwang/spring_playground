/**
 * 
 */
package com.bhuwan.spring.di.namespace;

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
        System.out.println(carName);
        System.out.println(engine.getModelYear());
    }
}
