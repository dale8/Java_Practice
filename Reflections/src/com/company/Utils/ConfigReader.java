/*
Вспомогоательный класс для получения значений из config файла
 */

package com.company.Utils;

import java.util.ResourceBundle;

public class ConfigReader {

    public static String readProp(String propStr){

        ResourceBundle res = ResourceBundle.getBundle("com.company.config");

        String prop = res.getString(propStr);
        return prop;
    }
}
