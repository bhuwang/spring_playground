/**
 * 
 */
package com.bhuwan.spring.di.factorybean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author bhuwan
 *
 */
public class CarFactory implements FactoryBean<Car> {

    private String carName;

    @Override
    public Car getObject() throws Exception {
        Car c = (Car) Class.forName(carName).newInstance();
        return c;
    }

    @Override
    public Class<?> getObjectType() {
        return Car.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

}
