public class LoggerDemo {
    public static void main(String[] args) {
        AppLogger logger = AppLogger.getLogger();
        System.out.println("Current log level: " + logger.getLogLevel());
        logger.displaySettings();
    }
}