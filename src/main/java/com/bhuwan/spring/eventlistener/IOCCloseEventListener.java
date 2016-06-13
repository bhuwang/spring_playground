/**
 * 
 */
package com.bhuwan.spring.eventlistener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;

/**
 * @author bhuwan
 *
 */
public class IOCCloseEventListener implements ApplicationListener<ContextClosedEvent> {

    /*
     * (non-Javadoc)
     * 
     * @see org.springframework.context.ApplicationListener#onApplicationEvent(org.springframework.context.ApplicationEvent)
     */
    @Override
    public void onApplicationEvent(ContextClosedEvent event) {
        System.out.println("on IOC close event........");
    }

}
