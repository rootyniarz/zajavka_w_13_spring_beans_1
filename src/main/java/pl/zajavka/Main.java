package pl.zajavka;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import pl.zajavka.code.ExamplePrototypeBean;
import pl.zajavka.code.ExampleSingletonBean;
import pl.zajavka.code.InjectedBean;
import pl.zajavka.configuration.ExampleConfigurationClass;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(ExampleConfigurationClass.class);
        ExampleSingletonBean singleton1 = context.getBean(ExampleSingletonBean.class);
        ExampleSingletonBean singleton2 = context.getBean(ExampleSingletonBean.class);

        ExamplePrototypeBean prototype1 = context.getBean(ExamplePrototypeBean.class);
        ExamplePrototypeBean prototype2 = context.getBean(ExamplePrototypeBean.class);

        System.out.println("singleton1==singleton2 ? " + (singleton1 == singleton2));
        System.out.println("prototype1==prototype2 ? " + (prototype1 == prototype2));

        InjectedBean injectedBean = context.getBean(InjectedBean.class);
        boolean isInjectedBeanAsSingelton =
                injectedBean == singleton1.getInjectedBean()
                && injectedBean == singleton2.getInjectedBean()
                && injectedBean == prototype1.getInjectedBean()
                && injectedBean == prototype2.getInjectedBean();

        System.out.println("Is InjectedBean as singleton? " + isInjectedBeanAsSingelton);

    }
}