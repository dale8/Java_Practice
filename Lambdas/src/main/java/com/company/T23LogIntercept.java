package com.company;

/*
* Вернуть лямбду, которая перед и после запуска
* переданной функции f, вызывает функцию логгера logFunc
*/

import com.company.Utils.Lambdas;

public class T23LogIntercept {

    public static void main(String[] args) {

        Lambdas.writeLog().intercept(x -> x+1, System.out::println).apply(10);
    }


}
