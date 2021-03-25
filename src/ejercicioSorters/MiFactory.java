package ejercicioSorters;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

public class MiFactory {
    public static Object getInstance(String objName) {

        try (InputStream input = new FileInputStream(objName)) {

            Properties prop = new Properties();

            prop.load(input);

            Class<?> clazz = Class.forName(prop.getProperty("sorter"));
            Constructor<?> ctor = clazz.getConstructor();
            Object object = ctor.newInstance();

            return object;


        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }

        return null;
    }
}
