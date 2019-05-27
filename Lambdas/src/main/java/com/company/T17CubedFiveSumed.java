package com.company;

/*
* Вернуть лямбду, которая решает уравнение
* x*x*x + y*y*y + z*z*z + u*u*u + v*v*v
* для заданных (x,y,z,u,v)
*/

import com.company.Utils.Lambdas;

public class T17CubedFiveSumed {

    public static void main(String[] args) {

        System.out.print("4^3 + 5^3 + 6^3 + 7^3 + 8^3 = ");
        System.out.println(Lambdas.sumOfCubedFive().apply(4, 5, 6, 7, 8));

    }
}
