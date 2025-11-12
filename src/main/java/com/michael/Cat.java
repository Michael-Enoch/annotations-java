package com.michael;

import com.michael.annotation.ImportantString;
import com.michael.annotation.RunImmediately;
import com.michael.annotation.VeryImportant;

@VeryImportant
public class Cat {
    @ImportantString
    String name;
    int age;
    public Cat(String name){
        this.name = name;
    }
    @RunImmediately( times = 3)
    public void meow(){
        System.out.println(this.name + " Meows !");
    }

    public void eat(){
        System.out.println("Munch!");
    }
}
