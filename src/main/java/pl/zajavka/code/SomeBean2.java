package pl.zajavka.code;

import org.springframework.stereotype.Service;

@Service
public class SomeBean2 implements SomeBean{
    public SomeBean2() {
        System.out.println("Calling SomeBean2");
    }

    public void someMethod(){
        System.out.println("Calling someMethod from SomeBean2");
    }
}
