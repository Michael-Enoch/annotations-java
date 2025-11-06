package com.michael;

import com.michael.annotation.VeryImportant;

public class CreatingAnnotations {
    static void main(String[] args) {
        Cat myCat = new Cat("Stella");

        if (myCat.getClass().isAnnotationPresent(VeryImportant.class)){
            System.out.println("This thing is very important");
        }else {
            System.out.println("This thing is not very important");
        };
    }
}
