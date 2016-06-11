/**
 * 
 */
package com.bhuwan.spring.di.stereotype.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author bhuwan
 *
 */
@Component
public class Car {

    @Autowired
    private Engine engine;

    public void printData() {
        System.out.println(engine.getModelYear());
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
