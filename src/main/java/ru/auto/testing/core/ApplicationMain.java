package ru.auto.testing.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class ApplicationMain {

    SeleniumDriver seleniumDriver = new SeleniumDriver();

    public ApplicationMain() throws IOException {
        seleniumDriver.executeTests();
    }

    public static void main(String[] args){
        SpringApplication.run(ApplicationMain.class);
    }

}
