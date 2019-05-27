package com.company;

/*
* Вернуть лямбду, которая проверяет число на принадлежность к ряду Фибоначчи.
* Лямбда должна запоминать ранее вычисленные значения.
*/

import com.company.Utils.Lambdas;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class T8FibonnacciTest {

    public static void main(String[] args) {

        System.out.println("First 10 Fibonacci numbers are:");
        Stream.iterate(new int[]{0, 1}, n -> new int[]{n[1], n[0] + n[1]})
                .map(n -> n[0])
                .limit(10)
                .forEach(x -> System.out.print(x + " "));
        System.out.println();

        Predicate<Integer> isFib = Lambdas.isFibonacci().get();


        System.out.println("Is 10 a Fibonacci number?");
        System.out.println(isFib.test(10));

        System.out.println("Is 5 a Fibonacci number?");
        System.out.println(isFib.test(5));

    }
}
