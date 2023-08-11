package com.manuraf.hello;

import org.springframework.stereotype.Component;

@Component
public class HelloService {

    public String greeting(String name) {
        return "Hello, " + name + "!\n";
    }
}