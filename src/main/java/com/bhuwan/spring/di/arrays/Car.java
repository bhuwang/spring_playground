/**
 * 
 */
package com.bhuwan.spring.di.arrays;

import org.springframework.beans.factory.annotation.Required;

/**
 * @author bhuwan
 *
 */
public class Car {

    private String[] carNames;
    private Engine[] engines;

    /**
     * @return the carNames
     */
    public String[] getCarNames() {
        return carNames;
    }

    /**
     * @param carNames
     *            the carNames to set
     */
    @Required
    public void setCarNames(String[] carNames) {
        this.carNames = carNames;
    }

    /**
     * @return the engines
     */
    public Engine[] getEngines() {
        return engines;
    }

    /**
     * @param engines
     *            the engines to set
     */
    public void setEngines(Engine[] engines) {
        this.engines = engines;
    }

    public void displayData() {
        for (String car : carNames) {
            System.out.println(car);
        }
        for (Engine e : engines) {
            System.out.println(e.getModelYear());
        }
    }

}
