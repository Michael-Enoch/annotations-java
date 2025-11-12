package com.michael;

import com.michael.annotation.ImportantString;
import com.michael.annotation.RunImmediately;
import com.michael.annotation.VeryImportant;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CreatingAnnotations {
    static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Cat myCat = new Cat("Stella");

        if (myCat.getClass().isAnnotationPresent(VeryImportant.class)){
            System.out.println("This thing is very important");
        }else {
            System.out.println("This thing is not very important");
        };

        for (Method method: myCat.getClass().getDeclaredMethods()){
            if(method.isAnnotationPresent(RunImmediately.class)){
                RunImmediately annotation = method.getAnnotation(RunImmediately.class);
                for (int i = 0; i < annotation.times(); i++) {
                    method.invoke(myCat);
                }
            };
        }

        for (Field field: myCat.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(ImportantString.class)){
                Object o = field.get(myCat);

                if (o instanceof String stringValue){
                    System.out.println(stringValue.toUpperCase());
                }
            }
        }
    }
}
