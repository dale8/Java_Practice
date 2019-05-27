package com.company;

/*
* Вернуть лямбду, которая поприветствует того,
* чье имя будет передано первым аргументом
*/

import com.company.Utils.Lambdas;

public class T2HelloUser {
    public static void main(String[] args) {

        String name = "User";

        Lambdas.welcomeUser().accept(name);
    }
}
