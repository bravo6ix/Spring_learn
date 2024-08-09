package com.nick.DemoApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary // Can not more than one in project
public class Laptop implements Computer {

    public void compile() {
        System.out.println("Compiling with 404 bugs");
    }

}
