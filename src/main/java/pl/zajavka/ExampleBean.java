package pl.zajavka;

public class ExampleBean {
    private InjectedBean injectedBean;
    private AnotherInjectedBean anotherInjectedBean;

    public void setInjectedBean(InjectedBean injectedBean) {
        this.injectedBean = injectedBean;
        System.out.println("Calling setInjectedBean");
    }

    public void setAnotherInjectedBean(AnotherInjectedBean anotherInjectedBean) {
        this.anotherInjectedBean = anotherInjectedBean;
        System.out.println("Calling setAnotherInjectedBean");
    }

    public void exampleMethod(){
        System.out.println("Calling exampleMethod");
    }
}
