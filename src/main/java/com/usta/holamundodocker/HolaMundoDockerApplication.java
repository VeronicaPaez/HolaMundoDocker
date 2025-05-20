package com.usta.holamundodocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HolaMundoDockerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HolaMundoDockerApplication.class, args);
    }

    @GetMapping("/")
    public String hello() {
        return "¡Hola desde Spring Boot en Docker!";
    }
}

