package pl.zajavka.code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


public class ExampleBean {
    private InjectedBean injectedBean;


    public ExampleBean() {
        System.out.println("Calling ExampleBean()");
    }

    @Autowired
    public ExampleBean(InjectedBean injectedBean){
        this.injectedBean = injectedBean;
        System.out.println("Calling ExampleBean(injectedBean");
    }

    public void exampleMethod() {
        System.out.println("Calling exampleMethod :" + injectedBean );
    }
}
