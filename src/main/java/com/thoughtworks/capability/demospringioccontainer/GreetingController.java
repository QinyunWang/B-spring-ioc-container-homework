package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * It contradicts the principle of inversion of control,
 * as we request the dependencies from the container directly.
 */
@RestController
public class GreetingController implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    public GreetingService getGreetingService() {
        return applicationContext.getBean(GreetingService.class);
    }

    @GetMapping("/greet")
    public String greet() {
        GreetingService greetingService = getGreetingService();
        System.out.println("Greeting Service: " + greetingService);
        System.out.println("Greeting Controller: " + this + "\n");
        return greetingService.sayHi();
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
