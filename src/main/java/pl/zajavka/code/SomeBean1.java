package pl.zajavka.code;

import org.springframework.stereotype.Service;

@Service
public class SomeBean1 implements SomeBean{
    public SomeBean1() {
        System.out.println("Calling SomeBean1");
    }

    public void someMethod(){
        System.out.println("Calling someMethod from SomeBean1");
    }
}
