package com.redhat.rest;

import org.ff4j.FF4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final FF4j ff4j;

    @Autowired
    public HelloController(FF4j ff4j) {
        this.ff4j = ff4j;
    }

    @RequestMapping(path = "/hello")
    public String hello() {
        if (ff4j.check("hello")) {
            return "Hello";
        } else {
            return "Buna";
        }
    }

}
