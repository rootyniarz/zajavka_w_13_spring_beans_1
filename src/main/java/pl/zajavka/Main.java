package pl.zajavka;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import pl.zajavka.code.PrototypeBean;
import pl.zajavka.code.SingletonBean;
import pl.zajavka.configuration.ExampleConfigurationClass;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(ExampleConfigurationClass.class);
        System.out.println("Context created");

        SingletonBean firstSingleton = context.getBean(SingletonBean.class);
        ObjectFactory<PrototypeBean> firstPrototypeFactory = firstSingleton.callPrototype();
        System.out.println("firstPrototypeFactory");
        PrototypeBean firstPrototype = firstPrototypeFactory.getObject();

        ObjectFactory<PrototypeBean> secondPrototypeFactory = firstSingleton.callPrototype();
        System.out.println("secondPrototypeFactory");
        PrototypeBean secondPrototype = secondPrototypeFactory.getObject();

        System.out.println("firstPrototype == secondPrototype? " + (firstPrototype == secondPrototype));
    }
}