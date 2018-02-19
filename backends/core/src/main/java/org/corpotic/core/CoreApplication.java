package org.corpotic.core;

import org.corpotic.core.models.User;
import org.corpotic.core.services.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoreApplication.class, args);

    }

    @Bean
    public CommandLineRunner demo(UserService userService) {
        return (args) -> {
            userService.save(new User("ronald eduardo", "correo", "password", "userName"));
        };
    }
}
