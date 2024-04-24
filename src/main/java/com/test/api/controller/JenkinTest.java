package com.test.api.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@Slf4j
public class JenkinTest {

    @GetMapping
    public String test(){
        log.info("<<<<<<  Jenkin test successful");
        log.debug("Jenkin test successful - 2nd time");
        return "Jenkin test successful";
    }
}
