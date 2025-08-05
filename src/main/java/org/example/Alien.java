package org.example;

public class Alien {

    private int age;
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

    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void code(){
        System.out.println("Alien is Coding!!");
        comp.compile();
    }
}
