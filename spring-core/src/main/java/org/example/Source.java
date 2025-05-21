package org.example;

public class Source {
    @Inject
    private Injectable injectable;

    public void call(){
        System.out.println("Source call()");
        injectable.doWork();
    }
}
