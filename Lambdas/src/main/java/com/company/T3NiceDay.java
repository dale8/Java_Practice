package com.company;

/*
* Вернуть лямбду, которая принимает в качестве аргумента предыдущую лямбду,
* и добавляет вывод “Have a nice day!” после выполнения лямбды
*/

import com.company.Utils.Lambdas;

import java.util.function.Consumer;

public class T3NiceDay {

    public static void main(String[] args) {

        String name = "User";
        Consumer<String> helloUser = Lambdas.welcomeUser();

        Lambdas.niceDay().apply(helloUser).accept(name);

    }
}
