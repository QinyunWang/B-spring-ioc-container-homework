package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    /**
     * Spring will override the getPrototypeBean() method annotated with @Lookup. It then registers the bean into the
     * application context. Whenever we request the getPrototypeBean() method, it returns a new PrototypeBean instance.
     * It will use CGLIB to generate the bytecode responsible for fetching the PrototypeBean from the application context.
     * @return GreetingService
     */
    @Lookup
    public GreetingService getGreetingService() {
        return null;
    }

    @GetMapping("/greet")
    public String greet() {
        GreetingService greetingService = getGreetingService();
        System.out.println("Greeting Service: " + greetingService);
        System.out.println("Greeting Controller: " + this + "\n");
        return greetingService.sayHi();
    }
}
