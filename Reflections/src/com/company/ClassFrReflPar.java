package com.company;

/*
Вызвать private конструктор с параметрами
*/

import com.company.Utils.BuildClass;

public class ClassFrReflPar {
    public static void main(String[] args) {

        BuildClass bc = new BuildClass();
        bc.buildClwPars(); // построение класса по имени считанному из файла

    }
}
