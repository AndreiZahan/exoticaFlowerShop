package com.academy.exotica.controller;

import com.academy.client.DatabaseClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomepageController {

    @Autowired
    DatabaseClient client;

    @RequestMapping("/welcome")
    public String hello() {
        ResponseEntity<String> write = client.write();
        String body = write.getBody();
        System.out.println(body);
        return body;
    }
}
