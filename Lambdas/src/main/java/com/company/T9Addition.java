package com.company;

/*
* Вернуть лямбду, которая возвращает сумму двух входных аргументов
*/

import com.company.Utils.Lambdas;

public class T9Addition {
    public static void main(String[] args) {

        System.out.println("Sum of 5 and 6 is:");
        System.out.println(Lambdas.sumInts().apply(5, 6));

    }
}
