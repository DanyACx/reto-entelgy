package com.entelgy.reto.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.entelgy.reto.service.AnimalService;
import com.entelgy.reto.util.AnimalFactory;

@Configuration
@ComponentScan(basePackages = "com.entelgy")
public class AppConfig {

	@Bean
    public AnimalFactory animalFactory() {
        return new AnimalFactory();
    }

    @Bean
    public AnimalService animalService(AnimalFactory animalFactory) {
        return new AnimalService(animalFactory);
    }
}
