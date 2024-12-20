package com.gta.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class BackendApplication {
    public BackendApplication() throws IOException {
    }

    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);
	}

}
