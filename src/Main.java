// Demo: Тестовый класс для демонстрации работы паттернов
public class Main {
    public static void main(String[] args) {
        // Тест Singleton
        ConfigurationManager configManager = ConfigurationManager.getInstance();
        System.out.println("maxPlayers: " + configManager.getConfig("maxPlayers"));
        configManager.printAllConfigs();

        // Тест Adapter
        LegacyChatService legacyChat = new LegacyChatService();
        ChatService chatAdapter = new ChatServiceAdapter(legacyChat);
        chatAdapter.sendMessage("Hello world!");
    }
}