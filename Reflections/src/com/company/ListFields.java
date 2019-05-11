package com.company;

/*
Получить список публичных полей.
Получить список приватных полей.
*/

import com.company.TestClasses.TestClass;
import com.company.Utils.PrintClassInfo;

public class ListFields {

    public static void main(String[] args) {
        TestClass test = new TestClass();

        PrintClassInfo pr = new PrintClassInfo();
        pr.printPubPrivF(test.getClass()); // информация о публичных и приватных полях

    }
}
