/*
Получить класс объекта
Получить информацию о модификаторах класса, полях, методах, константах, конструкторах и суперклассах
Выяснить, какие методы принадлежат реализуемому интерфейсу/интерфейсам
Получить список публичных методов. Получить список приватных методов.
Получить список публичных полей. Получить список приватных полей.
*/
package com.company.Utils;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class PrintClassInfo {


    public void printInf(Class c){
        System.out.println("OBJECT IS OF CLASS:");
        System.out.println(c.getName() + " " + convertMods(c.getModifiers()));

        System.out.println("SUPERCLASS IS:");
        System.out.println(c.getSuperclass());

        Field[] fields = c.getDeclaredFields();
        Method[] methods = c.getDeclaredMethods();
        Constructor[] constructors = c.getDeclaredConstructors();

        System.out.println("CONSTRUCTORS:");
        for (Constructor con: constructors
             ) {
            System.out.println(con.getName() + " " + convertMods(con.getModifiers()));
        }

        System.out.println("FIELDS AND THEIR MODIFIERS:");
        for (Field f: fields
        ) {
            System.out.println(f.getName() + " " + convertMods(f.getModifiers()));
        }

        System.out.println("METHODS AND THEIR MODIFIERS:");
        for (Method m: methods
        ) {
            System.out.println(m.getName() + " " + convertMods(m.getModifiers()));
        }
        System.out.println("");
    }

    public void printInter(Class c) {

        Class<?>[] interList = c.getInterfaces();

        System.out.println("OBJECT IMPLEMENTS:");
        for (Class<?> cl : interList
        ) {
            System.out.println(c);
            Method[] methods = cl.getDeclaredMethods();
            System.out.println("INTERFACE METHODS:");
            for (Method m: methods
                 ) {
                System.out.println(m.getName());
            }
        }

        System.out.println("");

    }

    public void printPubPrivM(Class c){
        Method[] methods = c.getDeclaredMethods();

        System.out.println("PUBLIC METHODS OF CLASS:");
        for (Method m: methods
        ) {
            if (m.getModifiers() == 1) {
                System.out.println(m.getName());
            }
        }

        System.out.println("PRIVATE METHODS OF CLASS:");
        for (Method m: methods
        ) {
            if (m.getModifiers() == 2) {
                System.out.println(m.getName());
            }
        }

        System.out.println("");
    }

    public void printPubPrivF(Class c){
        Field[] fields = c.getDeclaredFields();

        System.out.println("PUBLIC FIELDS OF CLASS:");
        for (Field f: fields
        ) {
            if (f.getModifiers() == 1) {
                System.out.println(f.getName());
            }
        }

        System.out.println("PRIVATE FIELDS OF CLASS:");
        for (Field f: fields
        ) {
            if (f.getModifiers() == 2) {
                System.out.println(f.getName());
            }
        }
        System.out.println("");
    }

    private String convertMods(int mod){
        String modif = Modifier.toString(mod);
        return modif;
    }

}
