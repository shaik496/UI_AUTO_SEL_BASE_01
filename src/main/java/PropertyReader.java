import org.apache.logging.log4j.Logger;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

    Logger log= AppLoggingUtil.getLogger(PropertyReader.class);

    private  Properties properties = new Properties();


    public PropertyReader() {
        try {
            properties.load(new FileInputStream("src/test/resources/UI_Objects/LoginPageObjects.properties"));
           log.info("Property file loaded successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public  String getProperty(String key) {
        return properties.getProperty(key);
    }
}