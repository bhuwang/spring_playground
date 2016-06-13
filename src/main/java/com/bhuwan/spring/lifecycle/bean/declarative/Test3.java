/**
 * 
 */
package com.bhuwan.spring.lifecycle.bean.declarative;

/**
 * @author bhuwan
 *
 */
public class Test3 {
    public void init() {
        System.out.println(this.getClass().getName() + " init method called....");
    }

    public void destroy() {
        System.out.println(this.getClass().getName() + " destroy method called....");
    }
}
