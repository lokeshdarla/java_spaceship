package org.lokeshdarla.springboottutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController("/api")
@EnableMongoRepositories(basePackages = "org.lokeshdarla.springboottutorial")
public class SpringBootTutorialApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootTutorialApplication.class, args);
    }
}
