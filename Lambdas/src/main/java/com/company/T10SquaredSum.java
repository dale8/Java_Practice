package com.company;

/*
* К предыдущей лямбде добавить возведение в квадрат
*/

import com.company.Utils.Lambdas;

import java.util.function.BinaryOperator;

public class T10SquaredSum {

    public static void main(String[] args) {

        BinaryOperator<Integer> sum = Lambdas.sumInts();

        System.out.println("Sum of 5 and 6 is 11 and 11 squared is:");
        System.out.println(Lambdas.squareSum().apply(sum).apply(5, 6));

    }
}
