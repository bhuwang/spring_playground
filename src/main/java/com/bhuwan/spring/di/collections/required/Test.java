/**
 * 
 */
package com.bhuwan.spring.di.collections.required;

import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.TreeSet;
import java.util.Vector;

/**
 * @author bhuwan
 *
 */
public class Test {

    private Vector<String> fruits;
    private TreeSet<String> footballers;
    private Hashtable<String, String> countriesCapitals;

    /**
     * @return the fruits
     */
    public Vector<String> getFruits() {
        return fruits;
    }

    /**
     * @param fruits
     *            the fruits to set
     */
    public void setFruits(Vector<String> fruits) {
        this.fruits = fruits;
    }

    /**
     * @return the footballers
     */
    public TreeSet<String> getFootballers() {
        return footballers;
    }

    /**
     * @param footballers
     *            the footballers to set
     */
    public void setFootballers(TreeSet<String> footballers) {
        this.footballers = footballers;
    }

    /**
     * @return the countriesCapitals
     */
    public Hashtable<String, String> getCountriesCapitals() {
        return countriesCapitals;
    }

    /**
     * @param countriesCapitals
     *            the countriesCapitals to set
     */
    public void setCountriesCapitals(Hashtable<String, String> countriesCapitals) {
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
