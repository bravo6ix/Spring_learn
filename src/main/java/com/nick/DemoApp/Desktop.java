package com.nick.DemoApp;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("desktop")  // specify qualifier name

public class Desktop implements Computer {

    public void compile() {
        System.out.println("Compiling with 404 bugs, but run faster");
    }

}
