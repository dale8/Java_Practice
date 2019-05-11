/*
Вызвать метод объекта по имени. Имя метода неизвестно до момента выполнения программы.
Вызвать private метод с параметрами
 */

package com.company.Utils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CallMethod {

    // without parameters
    public void methodCall(Object o){
        Method meth = null;

        try {
            meth = o.getClass().getDeclaredMethod(ConfigReader.readProp("methodToCall"));
            meth.setAccessible(true);
            meth.invoke(o);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        System.out.println("");

    }

    // with parameters
    public void methodCall(Object o, Object... params){
        Method meth = null;
        Class[] clp = new Class[params.length];

        for (int i = 0; i < clp.length; i++){
            clp[i] = params[i].getClass();
        }

        try {
            meth = o.getClass().getDeclaredMethod(ConfigReader.readProp("methodToCallWithParams"), clp);
            meth.setAccessible(true);
            meth.invoke(o, params);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        System.out.println("");

    }
}
