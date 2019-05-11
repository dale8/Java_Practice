package com.company;
/*
Создать экземпляр класса, причем имя класса неизвестно до момента
выполнения программы. (считывается из файла)
*/

import com.company.Utils.BuildClass;

public class ClassFromRefl {

    public static void main(String[] args) {

        BuildClass bc = new BuildClass();
        bc.buildCl(); // построение класса по имени считанному из файла

    }
}

