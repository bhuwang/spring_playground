/**
 * 
 */
package com.bhuwan.spring.eventlistener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

/**
 * @author bhuwan
 *
 */
public class IOCStartEventListener implements ApplicationListener<ContextStartedEvent> {

    @Override
    public void onApplicationEvent(ContextStartedEvent event) {
        System.out.println("on IOC start event........");
    }

}
