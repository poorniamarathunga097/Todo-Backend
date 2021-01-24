package lk.ijse.dep.web.util;

import java.io.IOException;
import java.util.Properties;

public class AppUtil {
    public static String getAppSecretKey() throws IOException {
        Properties prop = new Properties();
        prop.load(AppUtil.class.getResourceAsStream("/application.properties"));
        return prop.getProperty("app.key");
    }
}
