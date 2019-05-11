/*
Создать экземпляр класса, причем имя класса неизвестно до момента выполнения программы.
(считывается из файла)
 */

package com.company.Utils;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;


public class BuildClass {
    public void buildCl(){

        Object obj = builder(ConfigReader.readProp("classForBuild"));

        System.out.println("Class without parameters has been built");
        PrintClassInfo pci = new PrintClassInfo();
        pci.printInf(obj.getClass());
    }

    public void buildClwPars(){

        Object objPar = builder(ConfigReader.readProp("classForBuild"), 25, "parameter1", "parameter2");

        PrintClassInfo pci = new PrintClassInfo();
        System.out.println("Class with parameters has been built");
        pci.printInf(objPar.getClass());
    }


    private Object builder(String className, Object... params){

        Class cl = buildClass(className);
        Constructor constr = buildConstr(cl, params);
        Object obj = null;
        if (params.length == 0) {
            try {
                obj = constr.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }else {
            try {
                obj = constr.newInstance(params);
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }

        return obj;
    }


    private Class buildClass(String clName){
        Class cl = null;

        try {
            cl = Class.forName(clName);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return cl;
    }

    private Constructor buildConstr(Class cl, Object... p){
        Class[] pars = new Class[p.length];
        Constructor constr = null;

        if (pars.length == 0) {
            try {
                constr = cl.getDeclaredConstructor();
                constr.setAccessible(true);
                return constr;
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
                return null;
            }
        }else {
            for (int i = 0; i < pars.length; i++){
                pars[i] = p[i].getClass();
            }
            try {
                constr = cl.getDeclaredConstructor(pars);
                constr.setAccessible(true);
                return constr;
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
                return null;
            }

        }

    }

}
