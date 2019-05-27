package com.company;

/*
* Вернуть лямбду, которая вернет полином, основанный на переданных коэффициентах
*/

import com.company.Utils.Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class T20PolinomSolver {

    public static void main(String[] args) {

        Function<List<Integer>, Function<Integer, Integer>> f = Lambdas.getPolinom();

        System.out.println("f.apply(Arrays.asList(2, 3, 5)).apply(4) produces polinom: 2*x*x + 3*x + 5, where x=4");
        System.out.print("Result is: ");
        System.out.println(f.apply(Arrays.asList(2, 3, 5)).apply(4));
        System.out.println();

        System.out.println("f.apply(Arrays.asList(-5, -10)).apply(4) produces polinom: -5*x – 10, where x=4");
        System.out.print("Result is: ");
        System.out.println(f.apply(Arrays.asList(-5, -10)).apply(4));
        System.out.println();

        System.out.println("f.apply(Arrays.asList(8)).apply(4) produces result 8 " +
                "\n(that is only element on the list) and doesn't depending on x (x=4)");
        System.out.print("Result is: ");
        System.out.println(f.apply(Arrays.asList(8)).apply(4));
        System.out.println();
    }
}
