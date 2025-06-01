package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println("Main method was called");

        ObjectFactoryHolder objectFactoryHolder = context.getBean(ObjectFactoryHolder.class);

        System.out.println(objectFactoryHolder.getPrototypeComponent() == objectFactoryHolder.getPrototypeComponent());
        System.out.println(objectFactoryHolder.getFirstSingleton() == objectFactoryHolder.getFirstSingleton());
        System.out.println(objectFactoryHolder.getSecondSingleton() == objectFactoryHolder.getSecondSingleton());
    }
}
