package com.letsstartcoding.springbootrestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by User on 10/25/2018.
 */

@SpringBootApplication
@EnableJpaAuditing
public class EmployeeApp {

    @RequestMapping
    public static void main(String[] args) {
        SpringApplication.run(EmployeeApp.class, args);
    }
}
