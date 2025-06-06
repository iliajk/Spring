package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        SimpleBean bean = context.getBean(SimpleBean.class);
        bean.printName();
        ((AbstractApplicationContext) context).getBeanFactory().destroyBean(bean);
        bean = context.getBean(SimpleBean.class);
        if(bean == null){

        }
        bean = context.getBean(SimpleBean.class);
    }
}
