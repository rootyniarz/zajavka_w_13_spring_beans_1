package pl.zajavka.code;

import java.time.LocalTime;

public class SingletonBean {
    private PrototypeBean prototypeBean;

    public SingletonBean(PrototypeBean prototypeBean) {
        this.prototypeBean = prototypeBean;
        System.out.println("Calling SingletonBean constructor with injected PrototypeBean");
    }

    public PrototypeBean callPrototype(){
        System.out.println("Calling prototype" + LocalTime.now());
        return prototypeBean;
    }

}
