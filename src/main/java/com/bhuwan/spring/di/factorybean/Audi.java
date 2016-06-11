/**
 * 
 */
package com.bhuwan.spring.di.factorybean;

/**
 * @author bhuwan
 *
 */
public class Audi implements Car {

    /*
     * (non-Javadoc)
     * 
     * @see com.bhuwan.spring.di.factoryclasses.Car#drive()
     */
    @Override
    public void drive() {
        System.out.println("audi car driving");
    }

}
