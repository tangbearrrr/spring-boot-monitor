package com.tangbear.springbootmonitor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class PersonController {

    @GetMapping("/persons")
    public List<String> get() {
        List<String> persons = Arrays.asList("Adam", "John", "Chris");
        return persons;
    }
}
