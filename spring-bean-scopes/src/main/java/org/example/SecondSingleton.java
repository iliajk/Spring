package org.example;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
@Lazy
public class SecondSingleton {
    private Instant createdTime;

    private final PrototypeComponent component;

    private SecondSingleton(PrototypeComponent component) {
        System.out.println("SecondSingleton constructor called");
        createdTime = Instant.now();
        printCreatedTime();
        this.component = component;
        this.component.printCreatedTime();
    }

    public void printCreatedTime() {
        System.out.println("SecondSingleton created at: " + createdTime);
    }
}
