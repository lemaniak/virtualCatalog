package com.codgen.virtualcatalog.api.util;

import javax.inject.Named;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

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
}
