import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {


    private  Properties properties = new Properties();


    public PropertyReader() {
        try {
            properties.load(new FileInputStream("src/test/resources/UI_Objects/LoginPageObjects.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public  String getProperty(String key) {
        return properties.getProperty(key);
    }
}