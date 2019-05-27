package com.company;

/*
* Вернуть лямбду, которая решает уравнение
* (x^2 + 3x – 1)^2 + 3* (x^2 + 3x – 1) -1  для заданного x.
* Необходимо решить задачу переиспользованием предыдущей лямбды.
*/

import com.company.Utils.Lambdas;

import java.util.function.UnaryOperator;

public class T16ComplexEqSolver {

    public static void main(String[] args) {

        UnaryOperator<Integer> simpleEq = Lambdas.solveEquation();

        System.out.print("For x=5; (x^2 + 3x – 1)^2 + 3* (x^2 + 3x – 1) -1 = ");
        System.out.println(Lambdas.solveComplEq().apply(simpleEq).apply(5));

    }
}
