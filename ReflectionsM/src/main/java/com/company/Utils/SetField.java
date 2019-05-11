/*
Получить и установить значение поля объекта по имени. Поле неизвестно до момента выполнения программы.
Напечатать значение private поля
Модифицировать значение private поля
 */
package com.company.Utils;

import java.lang.reflect.Field;

public class SetField {
    public void setField(Object o, String newVal){
        Field field = null;
        String val = null;

        try {
            field = o.getClass().getDeclaredField(ConfigReader.readProp("fieldToChange"));
            field.setAccessible(true);
            val = (String) field.get(o);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println("INITIAL VALUE OF REQUESTED FIELD:");
        System.out.println(val);
        System.out.println("");

        try {
            field.set(o, newVal);
            val = (String)field.get(o);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println("NEW VALUE OF REQUESTED FIELD:");
        System.out.println(val);

    }
}
