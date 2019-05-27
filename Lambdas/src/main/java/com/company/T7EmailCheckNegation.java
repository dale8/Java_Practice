package com.company;

/*
* К предыдущей лямбде добавить отрицание.
*/

import com.company.Utils.Lambdas;

import java.util.function.Predicate;

public class T7EmailCheckNegation {

    public static void main(String[] args) {

        String noMatch = "n@t.match";
        String partlyMatch = "some@string";
        String match = "somebody@somwhere.some";
        Predicate<String> preCheck = Lambdas.isEmail();

        System.out.println("String \"" + noMatch + "\" is not an email and length is < 10");
        System.out.println(Lambdas.isMore10CharEm().apply(preCheck).negate().test(noMatch) + "\n");

        System.out.println("String \"" + partlyMatch + "\" is not an email and length is < 10");
        System.out.println(Lambdas.isMore10CharEm().apply(preCheck).negate().test(partlyMatch) + "\n");

        System.out.println("String \"" + match + "\" is not an email and length is < 10");
        System.out.println(Lambdas.isMore10CharEm().apply(preCheck).negate().test(match));

    }
}
