package com.michael;

import com.michael.annotation.RunImmediately;
import com.michael.annotation.VeryImportant;

import java.lang.reflect.Method;

public class CreatingAnnotations {
    static void main(String[] args) {
        Cat myCat = new Cat("Stella");

        if (myCat.getClass().isAnnotationPresent(VeryImportant.class)){
            System.out.println("This thing is very important");
        }else {
            System.out.println("This thing is not very important");
        };

        for (Method method: myCat.getClass().getDeclaredMethods()){
            method.isAnnotationPresent(RunImmediately.class);
        }
    }
}
