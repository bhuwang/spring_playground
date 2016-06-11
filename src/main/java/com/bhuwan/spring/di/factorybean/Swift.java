/**
 * 
 */
package com.bhuwan.spring.di.factorybean;

/**
 * @author bhuwan
 *
 */
public class Swift implements Car {

    /*
     * (non-Javadoc)
     * 
     * @see com.bhuwan.spring.di.factoryclasses.Car#drive()
     */
    @Override
    public void drive() {
        System.out.println("Swift car driving");
    }

}
