package com.manuraf.hello;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class HelloService {
    public String greeting(String name) {
        return "Guten Tag " + name;
    }
}
