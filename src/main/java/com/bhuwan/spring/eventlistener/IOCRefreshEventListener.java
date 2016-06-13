/**
 * 
 */
package com.bhuwan.spring.eventlistener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * @author bhuwan
 *
 */
public class IOCRefreshEventListener implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("on IOC refresh and container startup event........");
    }

}