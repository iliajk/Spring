package org.example;

import org.springframework.stereotype.Component;

@Component
public class DataComponent {
    public DataComponent() {
        System.out.println("DataComponent init");
    }

    public void work(){
        System.out.println("DataComponent work");
    }
}
