package org.example;

import org.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

       ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

       Alien alien = context.getBean(Alien.class);
       alien.code();
        System.out.println(alien.getAge());

    }
}
