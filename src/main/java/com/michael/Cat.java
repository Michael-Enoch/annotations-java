package com.michael;

import com.michael.annotation.RunImmediately;
import com.michael.annotation.VeryImportant;

@VeryImportant
public class Cat {
    String name;
    int age;
    public Cat(String name){
        this.name = name;
    }
    @RunImmediately
    public void meow(){
        System.out.println(this.name + "Meows !");
    }

    @RunImmediately
    public void eat(){
        System.out.println("Munch!");
    }
}
