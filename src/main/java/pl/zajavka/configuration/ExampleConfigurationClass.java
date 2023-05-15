package pl.zajavka.configuration;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import pl.zajavka.Main;
import pl.zajavka.code.PrototypeBean;
import pl.zajavka.code.SingletonBean;

@Configuration
@ComponentScan(basePackageClasses = Main.class) // dzieki temu Java sknuje w poszukiwniu beanow paczke w ktorej znajduje sie Main oraz paczki (podkatalogi)
public class ExampleConfigurationClass {

    @Bean
    public SingletonBean singletonBean(final PrototypeBean prototypeBean){
        return new SingletonBean(prototypeBean);
    }

    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public PrototypeBean prototypeBean(){
        return new PrototypeBean();
    }

}
