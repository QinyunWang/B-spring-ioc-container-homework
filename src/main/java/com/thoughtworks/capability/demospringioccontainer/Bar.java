package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.stereotype.Component;

@Component
public class Bar {

    private Foo foo;

    public void setFoo(Foo foo) {
        this.foo = foo;
    }
}
