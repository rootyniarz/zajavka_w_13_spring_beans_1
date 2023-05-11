package pl.zajavka;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ExampleConfigurationClass.class);

        System.out.println("Context created");

        //show all beans for context
        Arrays.asList(context.getBeanDefinitionNames()).forEach(name-> System.out.println(name));

        ExampleBean exampleBean = context.getBean("exampleBean", ExampleBean.class);
        exampleBean.exampleMethod();
    }
}