package pl.zajavka.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pl.zajavka.Main;
import pl.zajavka.code.InjectedBean;

@Configuration
@ComponentScan(basePackageClasses = Main.class) // dzieki temu Java sknuje w poszukiwniu beanow paczke w ktorej znajduje sie Main oraz paczki (podkatalogi)
public class ExampleConfigurationClass {

    @Bean(initMethod = "initMethod", destroyMethod = "destroyMethod")
    public InjectedBean injectedBean(){
        return new InjectedBean();
    }

}
