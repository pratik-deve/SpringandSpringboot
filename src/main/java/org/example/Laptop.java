package org.example;


import org.springframework.stereotype.Component;

@Component("laptop")
public class Laptop implements Computer {

    public void compile(){
        System.out.println("Laptop is Compiling!!");
    }
}
