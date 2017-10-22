package com.iwcn.master;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.iwcn.master.services.UserService;


@SpringBootApplication
public class EjemploWebThymeleafServiceSpringBootApp {
	
	@Bean
    public UserService userService() {
        return new UserService();
    }

    public static void main(String[] args) {
        SpringApplication.run(EjemploWebThymeleafServiceSpringBootApp.class, args);
    }

}
