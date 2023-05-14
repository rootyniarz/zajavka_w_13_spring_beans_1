package pl.zajavka.code;

import org.springframework.stereotype.Service;

public class InjectedBean {

    public InjectedBean() {
        System.out.println("Calling InjectedBean");
    }

    public void someMethod(){
        System.out.println("Calling someMethod from InjectedBean");
    }

    public void initMethod(){
        System.out.println("InjectedBeaan initMethod()");
    }

    public void destroyMethod(){
        System.out.println("InjectedBeaan destroyMethod()");
    }
}
