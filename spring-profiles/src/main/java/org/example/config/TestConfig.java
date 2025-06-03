package org.example.config;

import org.example.EnvPrinter;
import org.example.TestEnvPrinter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:test-application.properties")
@Profile("test")
public class TestConfig {
    @Bean
    public EnvPrinter envPrinter() {
        return new TestEnvPrinter();
    }
}
