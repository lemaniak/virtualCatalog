package com.codgen.virtualcatalog.api.util;

import javax.inject.Named;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;

/**
 * Created by vicente on 14/12/14.
 */

@Named
public class Utils {
    public static String getProperty(String property) {
        try {
            InputStream stream = Thread.currentThread().getContextClassLoader().getResourceAsStream("virtualCatalog.properties");
            Properties properties = new Properties();
            properties.load(stream);
            return properties.getProperty(property);
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return null;
    }

    public static String getMessage(String property,Locale locale) {
            if(locale==null){
                locale = new Locale("en", "US");
            }
            ResourceBundle messages = ResourceBundle.getBundle("ValidationMessages", locale);
            return messages.getString(property);
    }
}
