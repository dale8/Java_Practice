/*
Вспомогоательный класс для получения значений из config файла
 */

package com.company.Utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.ResourceBundle;

public class ConfigReader {

    public static String readProp(String propStr){

        String prop;
        String confName = "config.properties";

        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Properties props = new Properties();
        InputStream resourceStream = loader.getResourceAsStream(confName);
        try {
            props.load(resourceStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        prop = props.getProperty(propStr);

        return prop;
    }
}
