package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bar {

    private Foo foo;

    /**
     * This way Spring creates the beans, but the dependencies are not injected until they are needed.
     * @param foo
     */
    @Autowired
    public void setFoo(Foo foo) {
        this.foo = foo;
    }
}
