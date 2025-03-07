// Demo
public class Main {
    public static void main(String[] args) {
        // Singleton Test
        ConfigurationManager configManager = ConfigurationManager.getInstance();
        System.out.println("maxPlayers: " + configManager.getConfig("maxPlayers"));
        configManager.printAllConfigs();

        // Adapter Test
        LegacyChatService legacyChat = new LegacyChatService();
        ChatService chatAdapter = new ChatServiceAdapter(legacyChat);
        chatAdapter.sendMessage("Hello world!");
    }
}
