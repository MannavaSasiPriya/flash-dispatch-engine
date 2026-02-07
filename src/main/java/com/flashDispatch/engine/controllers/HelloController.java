package com.flashDispatch.engine.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/status")
    public String index() {
        return "Flash Dispatch Engine is Running!";
    }
}
