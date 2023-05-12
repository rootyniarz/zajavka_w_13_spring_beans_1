package pl.zajavka.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pl.zajavka.code.Marker;

@Configuration
@ComponentScan(basePackageClasses = Marker.class)
public class ExampleConfigurationClass {


}
