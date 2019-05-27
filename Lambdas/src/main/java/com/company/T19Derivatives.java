package com.company;

/*
* Вернуть лямбду, которая производит композицию двух функций. (f1,f2) => f2(f1(x))
* Для этого реализовать функциональный интерфейс.
 */

import com.company.FunctionalInterfaces.Compositor;
import com.company.Utils.Lambdas;

public class T19Derivatives {

    public static void main(String[] args) {

        System.out.print("f.compose(x -> x*2, x -> x-1).apply(10) = ");
        System.out.println(Lambdas.getDerivative().compose(x -> x*2, x -> x-1).apply(10));
        System.out.println();

        Compositor<Integer> c = Lambdas.getDerivative();
        System.out.print("f.compose(c.compose(x -> x*x, x -> x-10), c.compose(x -> x/2, x -> x+1)).apply(10) = ");
        System.out.println(Lambdas.getDerivative()
                .compose(c.compose(x -> x*x, x -> x-10),
                         c.compose(x -> x/2, x -> x+1))
                .apply(10));

    }
}
