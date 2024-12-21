package utilities;

import lombok.Getter;
import org.apache.log4j.Logger;

public class LoggerHelper {

    @Getter
    private static final Logger logger = Logger.getLogger(LoggerHelper.class);

    private LoggerHelper() {
    }

    public static void info(String message) {
        logger.info(message);
    }

    public static void debug(String message) {
        logger.debug(message);
    }

    public static void warn(String message) {
        logger.warn(message);
    }

    public static void error(String message) {
        logger.error(message);
    }

    public static void error(String message, Throwable t) {
        logger.error(message, t);
    }
}
