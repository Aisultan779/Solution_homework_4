import java.util.Properties;

public class AppLogger {
    private static AppLogger instance;
    private Properties logSettings = new Properties();

    private AppLogger() {
        logSettings.setProperty("logLevel", "INFO");
        logSettings.setProperty("maxFileSize", "10MB");
        logSettings.setProperty("logFormat", "JSON");
    }

    public static AppLogger getLogger() {
        if (instance == null) {
            instance = new AppLogger();
        }
        return instance;
    }

    public String getLogLevel() {
        return logSettings.getProperty("logLevel");
    }

    public void displaySettings() {
        System.out.println("=== Logger Configuration ===");
        logSettings.forEach((key, value) ->
                System.out.println(key + ": " + value));
    }
}