package com.api.parkingcontrolapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ParkingControlApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ParkingControlApiApplication.class, args);
    }

    @GetMapping("/")
    public String index() {
        return "Olá mundo!";
    }

}

