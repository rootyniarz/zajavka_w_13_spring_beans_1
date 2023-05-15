package pl.zajavka.code;

import org.springframework.beans.factory.ObjectFactory;

import java.time.LocalTime;

public class SingletonBean {
    private ObjectFactory<PrototypeBean> prototypeBean;

    public SingletonBean(ObjectFactory<PrototypeBean> prototypeBean) {
        this.prototypeBean = prototypeBean;
        System.out.println("Calling SingletonBean constructor with injected PrototypeBean");
    }

    public ObjectFactory<PrototypeBean> callPrototype(){
        System.out.println("Calling prototype :" + LocalTime.now());
        return prototypeBean;
    }

}
