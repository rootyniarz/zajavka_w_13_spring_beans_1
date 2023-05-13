package pl.zajavka.code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ExampleBean {
    private InjectedBean injectedBean;
//    private AnotherInjectedBean anotherInjectedBean;
    private SomeBean someBean;

    public ExampleBean() {
        System.out.println("Calling ExampleBean()");
    }

    @Autowired
    public ExampleBean(InjectedBean injectedBean, @Qualifier("someBean2") SomeBean someBean) {
        this.injectedBean = injectedBean;
        this.someBean = someBean;
        System.out.println("Calling ExampleBean(injectedBean,anotherInjectedBean)");
    }

    public void exampleMethod() {
        System.out.println("Calling exampleMethod :" + injectedBean + ", " + someBean);
    }
}
