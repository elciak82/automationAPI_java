package helpers;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Configuration {

    String property;

    public String getPropValue(String key) {
        try (InputStream input = new FileInputStream("src/test/java/resources/config.properties")) {
            Properties prop = new Properties();
            prop.load(input);
            property = prop.getProperty(key);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return property;
    }
}
