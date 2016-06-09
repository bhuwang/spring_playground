/**
 * 
 */
package com.bhuwan.spring.di.collections;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author bhuwan
 *
 */
public class InjectCollectionsDemo {

    private List<String> fruits;
    private Set<String> footballers;
    private Map<String, String> countriesCapitals;

    /**
     * @return the fruits
     */
    public List<String> getFruits() {
        return fruits;
    }

    /**
     * @param fruits
     *            the fruits to set
     */
    public void setFruits(List<String> fruits) {
        this.fruits = fruits;
    }

    /**
     * @return the footballers
     */
    public Set<String> getFootballers() {
        return footballers;
    }

    /**
     * @param footballers
     *            the footballers to set
     */
    public void setFootballers(Set<String> footballers) {
        this.footballers = footballers;
    }

    /**
     * @return the countriesCapitals
     */
    public Map<String, String> getCountriesCapitals() {
        return countriesCapitals;
    }

    /**
     * @param countriesCapitals
     *            the countriesCapitals to set
     */
    public void setCountriesCapitals(Map<String, String> countriesCapitals) {
        this.countriesCapitals = countriesCapitals;
    }

    public void printData() {
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        for (String footballer : footballers) {
            System.out.println(footballer);
        }
        for (Entry<String, String> entry : countriesCapitals.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

}
