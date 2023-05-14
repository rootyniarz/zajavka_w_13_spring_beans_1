package pl.zajavka;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.expression.EvaluationContext;
import pl.zajavka.code.ExampleBean;
import pl.zajavka.code.InjectedBean;
import pl.zajavka.configuration.ExampleConfigurationClass;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("### BEFORE context ###");
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(ExampleConfigurationClass.class);
        System.out.println("### AFTER context ###");

        System.out.println("### BEFORE been retrival ###");
        InjectedBean bean = context.getBean(InjectedBean.class);
        System.out.println("### AFTER been retrival ###");

        System.out.println("### BEFORE calling method ###");
        bean.someMethod();
        System.out.println("### AFTER calling method ###");

        System.out.println("### BEFORE context closeing ###");
        context.close();
        System.out.println("### AFTER context closeing ###");

    }
}