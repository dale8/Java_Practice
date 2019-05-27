package com.company;

/*
* Вернуть лямбду, которая печатает “Hello world!”
*
*/

import com.company.Utils.Lambdas;

public class T1HelloWorld {
    public static void main(String[] args) {

        String s = "Hello world";

       Lambdas.welcome().accept(s);
    }
}
