package org.example;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
@Component
public class SimpleBean implements BeanNameAware {
    private String beanName;
    public SimpleBean() {
        System.out.println("SimpleBean created");
    }
    @PostConstruct
    private void afterInitialization() {
        System.out.println("SimpleBean after initialization");
    }
    @PreDestroy
    private void preDestroy() {
        System.out.println("SimpleBean pre-destroy");
    }

    @Override
    public void setBeanName(String name) {
        this.beanName = name;
    }

    public void printName(){
        System.out.println("Bean name is : " + beanName);
    }
}
