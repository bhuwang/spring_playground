/**
 * 
 */
package com.bhuwan.spring.di.autowire.annotation.inject;

/**
 * @author bhuwan
 *
 */
public class Engine {

    private String modelYear;

    public Engine() {
        System.out.println("Engine object created successfully.");
    }

    /**
     * @return the modelYear
     */
    public String getModelYear() {
        return modelYear;
    }

    /**
     * @param modelYear
     *            the modelYear to set
     */
    public void setModelYear(String modelYear) {
        this.modelYear = modelYear;
    }

}
