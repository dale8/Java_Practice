package com.company;

/*
* К предыдущей лямбде добавить проверку на длину строки (> 10)
*/

import com.company.Utils.Lambdas;

import java.util.function.Predicate;

public class T6EmailLengthCheck {
    public static void main(String[] args) {

        String noMatch = "n@t.match";
        String partlyMatch = "some@string";
        String match = "somebody@somwhere.some";
        Predicate<String> preCheck = Lambdas.isEmail();

        System.out.println("Check if string \"" + noMatch + "\" is email and length is > 10");
        System.out.println(Lambdas.isMore10CharEm().apply(preCheck).test(noMatch) + "\n");

        System.out.println("Check if string \"" + partlyMatch + "\" is email and length is > 10");
        System.out.println(Lambdas.isMore10CharEm().apply(preCheck).test(partlyMatch) + "\n");

        System.out.println("Check if string \"" + match + "\" is email and length is > 10");
        System.out.println(Lambdas.isMore10CharEm().apply(preCheck).test(match));

    }
}
