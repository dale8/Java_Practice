package com.company;

/*
* Вернуть лямбду, которая решает уравнение x^2 + 3x – 1 для заданного x
*/

import com.company.Utils.Lambdas;

public class T15EquationSolver {

    public static void main(String[] args) {

        System.out.print("For x=5; x^2 + 3x - 1 = ");
        System.out.println(Lambdas.solveEquation().apply(5));

    }
}
