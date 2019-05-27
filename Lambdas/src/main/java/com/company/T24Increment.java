package com.company;

import com.company.Utils.Lambdas;

import java.util.function.Supplier;

public class T24Increment {

    public static void main(String[] args) {

        Supplier<Integer> s = Lambdas.countFromX().apply(100);
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
    }
}
