package com.manuraf.hello;

import com.manuraf.hello.model.Greeting;
import com.manuraf.hello.model.User;
import org.springframework.stereotype.Component;
import java.util.function.Function;

@Component
public class Hello implements Function<User, Greeting> {

    @Override
    public Greeting apply(User user) {
        return new Greeting("Hello, " + user.getName() + "!\n");
    }
}