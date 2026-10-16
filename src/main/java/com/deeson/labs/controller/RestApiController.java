package com.deeson.labs.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api")
public class RestApiController {

    @GetMapping("/name/{username}")
    public String getHealthApi(@PathVariable(required = false) String username) {
        log.info("Health api called: " + username);
        return "Welcome, " + username;
    }
}
