package org.example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;



@Component
public class Alien {

    @Value("49")
    private int age;

//    @Autowired //Field injection
//    @Qualifier("desktop")
    private Computer comp;

    public Alien(){
        System.out.println("Default Constructor Called!!");
    }
    public Alien(Computer comp, int age){
        this.comp = comp;
        this.age = age;
    }

    public Computer getComp() {
        return comp;
    }

    @Autowired //Setter injection
    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Setter Called!!");
        this.age = age;
    }

    public void code(){
        System.out.println("Alien is Coding!!");
        comp.compile();
    }
}
