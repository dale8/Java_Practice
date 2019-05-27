package com.company;

/*
* Вернуть лямбду, которая возвращает лямбду, возводящую в заданную степень
*/

import com.company.Utils.Lambdas;

public class T18PowerOf {

    public static void main(String[] args) {

        System.out.print("5^3 = ");
        System.out.println(Lambdas.power().apply(3).apply(5));

    }
}
