package com.example.myfridgigobackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@SpringBootApplication
public class MyFridgiGoBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyFridgiGoBackendApplication.class, args);
    }

}