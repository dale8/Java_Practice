package com.company;

/*
* Вернуть лямбду, которая кеширует результат некоторой функции,
* которая является входных аргументом
*/

import com.company.Utils.Lambdas;

import java.util.function.Function;
import java.util.function.Supplier;

public class T21CacheFuncRes {

    public static void main(String[] args) {

        Function<Supplier<Double>, Double> f = Lambdas.cacheRand();
        Supplier<Double> s = Math::random;

        System.out.println(f.apply(s));
        System.out.println(f.apply(s));
        System.out.println(f.apply(s));
    }
}
