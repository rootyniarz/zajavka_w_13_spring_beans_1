package pl.zajavka.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pl.zajavka.Main;

@Configuration
@ComponentScan(basePackageClasses = Main.class) // dzieki temu Java sknuje w poszukiwniu beanow paczke w ktorej znajduje sie Main oraz paczki (podkatalogi)
public class ExampleConfigurationClass {


}
