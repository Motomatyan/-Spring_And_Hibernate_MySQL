package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:properties")
//@ComponentScan("org.example")
public class myConfig {

    @Bean
    public Pet cat (){
        return new Cat();
    }

    @Bean
    public Person person(){
        return new Person(cat());
    }

}
