package dev.rappiUnac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.config.EnableWebFlux;

@Service
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
@EnableWebFlux
@EnableCaching
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
