package com.Ming.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class HomeController {

    @RequestMapping("/")
    //@ResponseBody   // It can set it as html body
    public String greet() {

        return "Welcome to Ming web app!";
    }

    @RequestMapping("/about")
    public String about() {
        return "Welcome to about page";
    }
}
