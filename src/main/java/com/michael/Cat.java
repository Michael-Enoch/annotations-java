package com.michael;

public class Cat {
    String name;
    int age;
    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void meow(){
        System.out.println(this.name + "Meows !");
    }

    public void eat(){
        System.out.println("Munch!");
    }
}
