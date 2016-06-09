/**
 * 
 */
package com.bhuwan.spring;

/**
 * @author bhuwan
 *
 */
public class NameAndGender {

    private String gender;
    private String fromLocation;

    NameAndGender(String fromLocation) {
        this.fromLocation = fromLocation;
    }

    public void sayHello(String name) {
        if ("M".equals(gender)) {
            System.out.println("Hello Mr. " + name + " from " + fromLocation);
        } else {
            System.out.println("Hello MS. " + name + " from " + fromLocation);
        }
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender
     *            the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }
}
