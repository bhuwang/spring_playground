/**
 * 
 */
package com.bhuwan.spring.di.lookupmethod;

/**
 * Concrete class
 * 
 * @author bhuwan
 *
 */
public class Truck {

    public Engine myTruckEngine() {
        Engine e = new Engine();
        e.setEngineName("My Truck Engine : Eicher");
        return e;
    }
}
