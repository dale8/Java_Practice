package com.company;

/*
* Добавить к предыдущей лямбде декремент после
*/

import com.company.Utils.Lambdas;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class T14PostDecremented {

    public static void main(String[] args) {

        UnaryOperator<Integer> sqrt = Lambdas.squareNum();
        BiFunction<UnaryOperator<Integer>, Integer, Integer> preInc = Lambdas.preIncrement();
        Function<UnaryOperator<Integer>, UnaryOperator<Integer>> pre = Lambdas.preInc();

        System.out.println("((5 + 1)^2) - 1 is:");
        System.out.println(Lambdas.postDecrement().apply(preInc).apply(sqrt, 5)); // solved with BiFunction

        System.out.println(Lambdas.postDec().apply(pre).apply(sqrt).apply(5)); // solved with Function

    }
}
