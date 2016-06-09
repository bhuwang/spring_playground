/**
 * 
 */
package com.bhuwan.spring.di.properties;

import java.util.Map.Entry;
import java.util.Properties;

/**
 * @author bhuwan
 *
 */
public class Test {

    private Properties driverProperties;

    /**
     * @return the driverProperties
     */
    public Properties getDriverProperties() {
        return driverProperties;
    }

    /**
     * @param driverProperties
     *            the driverProperties to set
     */
    public void setDriverProperties(Properties driverProperties) {
        this.driverProperties = driverProperties;
    }

    public void printData() {
        for (Entry<Object, Object> entry : driverProperties.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
