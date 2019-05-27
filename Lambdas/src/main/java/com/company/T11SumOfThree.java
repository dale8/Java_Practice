package com.company;

/*
* Вернуть лямбду, которая возвращает сумму трех входных аргументов
*/

import com.company.Utils.Lambdas;


public class T11SumOfThree {

    public static void main(String[] args) {

        System.out.println("Sum of 5, 6 and 7 is:");
        System.out.println(Lambdas.sumThreeNums().apply(5, 6, 7));

    }
}
