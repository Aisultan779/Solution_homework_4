import java.util.HashMap;
import java.util.Map;


public class ConfigurationManager {

    private static ConfigurationManager instance = null;

    private Map<String, String> configurations;

    private ConfigurationManager() {
        configurations = new HashMap<>();
        configurations.put("maxPlayers", "100");
        configurations.put("defaultLanguage", "en");
        configurations.put("gameDifficulty", "medium");
    }
    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }
    public String getConfig(String key) {
        return configurations.get(key);
    }
    public void printAllConfigurations() {
        System.out.println("Конфигурационные настройки:");
        configurations.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}
