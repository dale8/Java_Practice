package com.company;

/*
* Вернуть лямбду, которая запускает переданную функцию f,
* и в случае исключения перезапускает ее n раз
*/


import com.company.Utils.Lambdas;

import java.util.Random;
import java.util.function.Supplier;

public class T22ExceptionCatch {

    public static void main(String[] args) {

        Supplier<Integer> s = () -> {
            int x = new Random().nextInt(10);
            if (x >= 5){
                throw new RuntimeException("exception");
            }
            return x;
        };

        System.out.println(Lambdas.catchErr().apply(s)); // will call s until the result of s is not an exception

    }
}
