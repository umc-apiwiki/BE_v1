package com.umc.apiwiki.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
public class MainController {
    @GetMapping
    public Map<String, Object> GetTest(){
        return Collections.singletonMap("test", 235153);
    }
}
