package com.company;

/*
Вызвать метод объекта по имени. Имя метода неизвестно
до момента выполнения программы (считывается из файла).
*/

import com.company.TestClasses.TestClass;
import com.company.Utils.CallMethod;

public class ExecuteMethod {

    public static void main(String[] args) {
        // write your code here
        TestClass test = new TestClass();

        CallMethod cm = new CallMethod();
        cm.methodCall(test);   // вызов приватного метода по имени считанному из файла, метод без параметров

    }
}
