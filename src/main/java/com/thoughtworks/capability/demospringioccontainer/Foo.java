package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Foo {

    private Bar bar;

    @Autowired
    public Foo(Bar bar) {
        this.bar = bar;
    }

    /**
     * Another way to break the cycle is injecting a dependency using @Autowired on one of the beans, and then use a
     * method annotated with @PostConstruct to set the other dependency.
     */
    @PostConstruct
    public void init() {
        bar.setFoo(this);
    }
}
