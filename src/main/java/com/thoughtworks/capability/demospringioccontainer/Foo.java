package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class Foo {

    private Bar bar;

    /**
     * This way Spring creates the beans, but the dependencies are not injected until they are needed.
     * @param bar
     */
    @Autowired
    public void setBar(Bar bar) {
        this.bar = bar;
    }
}
