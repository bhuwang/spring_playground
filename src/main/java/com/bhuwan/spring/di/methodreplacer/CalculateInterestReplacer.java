/**
 * 
 */
package com.bhuwan.spring.di.methodreplacer;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

/**
 * @author bhuwan
 *
 */
public class CalculateInterestReplacer implements MethodReplacer {

    /*
     * (non-Javadoc)
     * 
     * @see org.springframework.beans.factory.support.MethodReplacer#reimplement(java.lang.Object, java.lang.reflect.Method,
     * java.lang.Object[])
     */
    @Override
    public Object reimplement(Object o, Method m, Object[] params) throws Throwable {
        System.out.println("CalculateInterestReplacer class new implementation invoked.");
        return null;
    }

}
