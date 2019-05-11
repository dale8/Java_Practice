package com.company;

/*
Получить список публичных методов.
Получить список приватных методов.
*/

import com.company.TestClasses.TestClass;
import com.company.Utils.PrintClassInfo;

public class ListMethods {

    public static void main(String[] args) {
        TestClass test = new TestClass();

        PrintClassInfo pr = new PrintClassInfo();
        pr.printPubPrivM(test.getClass()); // информация о публичных и приватных методах

    }
}
