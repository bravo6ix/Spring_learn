package com.nick.DemoApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    @Autowired // field injection

    // @Autowired is one of the core annotations in Spring,
    // used for automatic dependency injection.
    //In simpler terms, it allows Spring to automatically
    //wire the required beans (dependencies) into your classes,
    //eliminating the need for manual configuration.

    private Computer comp;

    // public Dev(Laptop laptop) {
    //     this.laptop = laptop;
    // }

    // no autowired constructor
    // public void setLaptop(Laptop laptop){
    //     this.laptop = laptop;
    // }

    public void build() {
        comp.compile();
        //debug();
        System.out.println("Working on Awesome Project");
    }
}