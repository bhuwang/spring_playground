/**
 * 
 */
package com.bhuwan.spring.di.stereotype.j2ee;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * @author bhuwan
 *
 */

// here you can use either @Component/@Named annotation
@Named
public class Car {

    /**
     * you can use @AutoWired/@Resource/@Inject
     */
    @Inject
    private Engine engine;

    public void printData() {
        System.out.println("Model Year: " + engine.getModelYear());
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
}
