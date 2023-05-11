package pl.zajavka;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.zajavka.code.InjectedBean;
import pl.zajavka.configuration.ExampleConfigurationClass;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ExampleConfigurationClass.class);
        System.out.println("Context created");

        InjectedBean bean = context.getBean(InjectedBean.class);
        bean.someMethod();
    }
}