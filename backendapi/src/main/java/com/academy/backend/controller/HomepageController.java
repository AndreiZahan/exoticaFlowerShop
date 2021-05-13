package com.academy.backend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/database")
public class HomepageController {
    @RequestMapping("/join")
    public String joinDatabase() {
        return "This is my first entry for db.";
    }
}
