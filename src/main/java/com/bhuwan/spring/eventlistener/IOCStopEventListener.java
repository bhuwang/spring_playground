/**
 * 
 */
package com.bhuwan.spring.eventlistener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

/**
 * @author bhuwan
 *
 */
public class IOCStopEventListener implements ApplicationListener<ContextStoppedEvent> {

    @Override
    public void onApplicationEvent(ContextStoppedEvent event) {
        System.out.println("on IOC stop event........");
    }

}
