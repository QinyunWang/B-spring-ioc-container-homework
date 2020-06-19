package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class Foo {

    private Bar bar;

    /**
     * A simple way to break the cycle is saying Spring to initialize one of the beans lazily. That is: instead of fully
     * initializing the bean, it will create a proxy to inject it into the other bean. The injected bean will only be
     * fully created when it’s first needed.
     * @param bar
     */
    public Foo(@Lazy Bar bar) {
        this.bar = bar;
    }
}
