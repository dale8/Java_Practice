package com.company;
/*
Получить класс объекта
Получить информацию о модификаторах класса, полях, методах, константах, конструкторах и суперклассах
Выяснить, какие методы принадлежат реализуемому интерфейсу/интерфейсам
*/


import com.company.TestClasses.TestClass;
import com.company.Utils.BuildClass;
import com.company.Utils.CallMethod;
import com.company.Utils.PrintClassInfo;
import com.company.Utils.SetField;

public class ClassInfo {

    public static void main(String[] args) {
	// write your code here
        TestClass test = new TestClass();

        PrintClassInfo pr = new PrintClassInfo();

        pr.printInf(test.getClass()); // информация о классе, полях, методах, конструкторах
        pr.printInter(test.getClass()); // информация о реализуемом интрефейсе и его методах

    }
}
