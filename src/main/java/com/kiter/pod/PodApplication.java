package com.kiter.pod;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.kiter"})
public class PodApplication {

    public static void main(String[] args) {
        SpringApplication.run(PodApplication.class, args);
    }

}
