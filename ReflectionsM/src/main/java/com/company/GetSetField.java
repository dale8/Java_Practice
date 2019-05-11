package com.company;
/*
Получить и установить значение поля объекта по имени. Поле
неизвестно до момента выполнения программы (считывается из файла).
Напечатать значение private поля
Модифицировать значение private поля
*/

import com.company.TestClasses.TestClass;
import com.company.Utils.SetField;

public class GetSetField {

    public static void main(String[] args) {
        // write your code here
        TestClass test = new TestClass();

        SetField setF = new SetField();
        setF.setField(test, "new value of test string"); // считывание и изменение значения приватного поля

    }
}
