
public class Homework4Demo {
    public static void main(String[] args) {
        System.out.println("=== Демонстрация ConfigurationManager ===");
        ConfigurationManager configManager = ConfigurationManager.getInstance();
        System.out.println("maxPlayers: " + configManager.getConfig("maxPlayers"));
        configManager.printAllConfigurations();

        System.out.println("\n=== Демонстрация ChatServiceAdapter ===");
        LegacyChatService legacyService = new LegacyChatService();
        ChatService chatService = new ChatServiceAdapter(legacyService);
        chatService.sendMessage("Hello world!");
    }
}
