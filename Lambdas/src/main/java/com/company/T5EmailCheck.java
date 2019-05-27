package com.company;

/*
* Вернуть лямбду, которая проверяет строку на наличие в ней email.
* Под email понимать любую строку, которая ввыглядит
* как <любые символы>@<любые символы>.<любые символы>
 */

import com.company.Utils.Lambdas;

public class T5EmailCheck {

    public static void main(String[] args) {

        String noMatch = "some string";
        String partlyMatch = "some@string";
        String match = "somebody@somwhere.some";

        System.out.println("Check if string \"" + noMatch + "\" is email");
        System.out.println(Lambdas.isEmail().test(noMatch) + "\n");

        System.out.println("Check if string \"" + partlyMatch + "\" is email");
        System.out.println(Lambdas.isEmail().test(partlyMatch) + "\n");

        System.out.println("Check if string \"" + match + "\" is email");
        System.out.println(Lambdas.isEmail().test(match) + "\n");

    }
}
