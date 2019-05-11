package com.company;

/*
Вызвать private метод с параметрами
*/

import com.company.TestClasses.TestClass;
import com.company.Utils.CallMethod;


public class ExecMethPars {

    public static void main(String[] args) {
        // write your code here
        TestClass test = new TestClass();

        CallMethod cm = new CallMethod();
        cm.methodCall(test, "parameter"); // метод с 1 параметром
        cm.methodCall(test, "another parameter", 25, 'a'); // метод с 3-мя параметрами


    }
}
