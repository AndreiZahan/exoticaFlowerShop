package com.academy.client;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class DatabaseClient {
    public ResponseEntity<String> write() {
        System.out.println("WRITE");

        RestTemplate template = new RestTemplate();
        String url = "http://localhost:8080/database/join";
        System.out.println("DatabaseClient sending request");
        return template.postForEntity(url, "", String.class);
    }

    public void read() {
        System.out.println("READ");
    }
}
