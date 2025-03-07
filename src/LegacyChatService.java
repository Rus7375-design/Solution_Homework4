// Adapter: Legacy Chat Service
class LegacyChatService {
    public void sendOldMessage(String msg) {
        System.out.println("Legacy Chat: " + msg);
    }
}

// Target Interface
interface ChatService {
    void sendMessage(String message);
}

// Adapter
class ChatServiceAdapter implements ChatService {
    private final LegacyChatService legacyChatService;

    public ChatServiceAdapter(LegacyChatService legacyChatService) {
        this.legacyChatService = legacyChatService;
    }

    @Override
    public void sendMessage(String message) {
        legacyChatService.sendOldMessage(message);
    }
}