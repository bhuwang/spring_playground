/**
 * 
 */
package com.bhuwan.spring.di.namespace;

/**
 * @author bhuwan
 *
 */
public class Engine {

    private String modelYear;

    public Engine(String modelYear) {
        this.modelYear = modelYear;
    }

    /**
     * @return the modelYear
     */
    public String getModelYear() {
        return modelYear;
    }

}
