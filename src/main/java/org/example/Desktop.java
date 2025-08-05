package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("desktop")
@Primary //In case of ambiguity!!
@Scope("prototype")
public class Desktop implements Computer {


    public void compile(){
        System.out.println("Desktop is Compiling!!");
    }
}
