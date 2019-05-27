package com.company;

/*
* Вернуть лямбду, которая возвращает текущее время
*/

import com.company.Utils.Lambdas;

public class T4DisplayTime {
    public static void main(String[] args) {

        System.out.println("Current time is:");
        System.out.println(Lambdas.getTime().get());
    }
}
