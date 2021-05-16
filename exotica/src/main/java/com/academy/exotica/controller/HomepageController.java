package com.academy.exotica.controller;

import com.academy.client.DatabaseClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/home")
public class HomepageController {

    @Autowired
    DatabaseClient client;

    @GetMapping("/welcome")
    public String hello() {
        ResponseEntity<String> write = client.write();
        String body = write.getBody();
        System.out.println(body);
        return "index";
    }
}
