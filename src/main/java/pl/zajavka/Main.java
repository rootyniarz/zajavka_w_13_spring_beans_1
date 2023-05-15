package pl.zajavka;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import pl.zajavka.code.PrototypeBean;
import pl.zajavka.code.SingletonBean;
import pl.zajavka.configuration.ExampleConfigurationClass;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(ExampleConfigurationClass.class);
        SingletonBean firstSingleton = context.getBean(SingletonBean.class);
        PrototypeBean firstPrototype = firstSingleton.callPrototype();

        SingletonBean secondSingleton = context.getBean(SingletonBean.class);
        PrototypeBean secondPrototype = firstSingleton.callPrototype();

        System.out.println("firstPrototype == secondPrototype ?" + (firstPrototype == secondPrototype));
    }
}