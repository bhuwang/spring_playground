/**
 * 
 */
package com.bhuwan.spring.di.factorymethod;

/**
 * @author bhuwan
 *
 */
public class TestStatic {

    private static TestStatic t;

    private TestStatic() {
        System.out.println("Private constructor........TestStatic");
    }

    public static TestStatic geInstance() {
        if (t == null) {
            return new TestStatic();
        } else {
            return t;
        }
    }

    public String printName() {
        return "Bhuwan Gautam";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
