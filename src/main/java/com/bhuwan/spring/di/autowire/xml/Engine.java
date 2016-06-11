/**
 * 
 */
package com.bhuwan.spring.di.autowire.xml;

/**
 * @author bhuwan
 *
 */
public class Engine {

    private String modelYear;

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

    public void printData() {
        System.out.println("Engine model year: " + getModelYear());
    }

}
