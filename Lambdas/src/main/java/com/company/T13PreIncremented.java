package com.company;

/*
* Добавить к предыдущей лямбде инкремент перед
*/

import com.company.Utils.Lambdas;

import java.util.function.UnaryOperator;

public class T13PreIncremented {

    public static void main(String[] args) {

        UnaryOperator<Integer> sqrt = Lambdas.squareNum();

        System.out.print("(5 + 1)^2 = ");
        System.out.println(Lambdas.preIncrement().apply(sqrt, 5)); // solved with BiFunction

        System.out.println(Lambdas.preInc().apply(sqrt).apply(5)); // solved with Function

    }

}
