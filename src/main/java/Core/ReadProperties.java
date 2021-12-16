package Core;

import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
    private static Properties properties = null;
    private static String filename = "config.properties";

    static {
        properties = new Properties();
        try {
            properties.load(ReadProperties.class.getClassLoader().getResourceAsStream(filename));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NullPointerException npe) {

        }
    }

    public static String getUrl() {
        return properties.getProperty("url");
    }

    public static String getbrowserType() {
        return properties.getProperty("browserType");
    }

    public static boolean getheadless() {
        return properties.getProperty("headless").equalsIgnoreCase("false");
    }

    public static String getusername() {
        return properties.getProperty("username");
    }

    public static String getpassword() {
        return properties.getProperty("password");
    }
}
