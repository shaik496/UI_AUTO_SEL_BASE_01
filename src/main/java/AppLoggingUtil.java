import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;

public class AppLoggingUtil {

    static Logger logManager;

    static {

        try {
            Configurator.initialize(null, "src/test/resources/FlightRegisterAppLogConfig.xml");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
    public static Logger getLogger(Class<?> clazz) {
        return  LogManager.getLogger(clazz);
    }
}
