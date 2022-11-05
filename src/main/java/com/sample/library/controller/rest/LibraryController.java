package com.sample.library.controller.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {

    @GetMapping("/ping")
    public String ping(){
        return "Hello Ping!";
    }
}
