package org.config;

import org.example.Alien;
import org.example.Computer;
import org.example.Desktop;
import org.example.Laptop;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


@Configuration
@ComponentScan("org.example")
public class AppConfig {


//    @Bean
//    public Alien alien(@Qualifier("laptop") Computer comp){
//        Alien alien = new Alien();
//        alien.setAge(45);
//        alien.setComp(comp);
//        return alien;
//    }
//
//
//    @Bean
//    @Primary
//    public Desktop desktop(){
//        return new Desktop();
//    }
//
//    @Bean
//    //@Bean(name={"lap", "laptop1", "lappy"})
//    public Laptop laptop(){
//        return new Laptop();
//    }





}
