package org.lokeshdarla.blogapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class})
public class BlogAppApplication {
    public static void main(String[] args) {
        SpringApplication.run(BlogAppApplication.class, args);
    }
}
