// Adapter: Устаревшая служба чата
class LegacyChatService {
    // Метод устаревшего чата для отправки сообщения
    public void sendOldMessage(String msg) {
        System.out.println("Legacy Chat: " + msg);
    }
}

// Target Interface: Новый интерфейс для службы чата
interface ChatService {
    // Метод для отправки сообщения в новом формате
    void sendMessage(String message);
}

// Adapter: Адаптер, который позволяет работать с устаревшей системой через новый интерфейс
class ChatServiceAdapter implements ChatService {
    private final LegacyChatService legacyChatService;

    // Конструктор принимает объект устаревшего сервиса
    public ChatServiceAdapter(LegacyChatService legacyChatService) {
        this.legacyChatService = legacyChatService;
    }

    // Реализация метода нового интерфейса, вызывающая устаревший метод
    @Override
    public void sendMessage(String message) {
        legacyChatService.sendOldMessage(message);
    }
}
