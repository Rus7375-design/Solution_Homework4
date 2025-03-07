import java.util.Map;
import java.util.HashMap;

// Singleton: ConfigurationManager
class ConfigurationManager {
    private static ConfigurationManager instance;
    private final Map<String, String> config;

    // Приватный конструктор для предотвращения создания экземпляров извне
    private ConfigurationManager() {
        config = new HashMap<>();
        config.put("maxPlayers", "100");
        config.put("defaultLanguage", "en");
        config.put("gameDifficulty", "medium");
    }

    // Метод для получения единственного экземпляра (ленивая инициализация)
    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    // Метод для получения значения конфигурации по ключу
    public String getConfig(String key) {
        return config.get(key);
    }

    // Метод для вывода всех параметров конфигурации
    public void printAllConfigs() {
        config.forEach((key, value) -> System.out.println(key + " = " + value));
    }
}