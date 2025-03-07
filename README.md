README

Описание

Этот проект демонстрирует использование двух продвинутых структурных паттернов проектирования: Singleton и Adapter.

1. ConfigurationManager (Singleton)

Этот класс обеспечивает централизованное управление конфигурацией, гарантируя, что в приложении существует только один экземпляр менеджера конфигурации.

2. ChatServiceAdapter (Adapter)

Адаптер позволяет интегрировать устаревшую службу чата (LegacyChatService) с новым интерфейсом (ChatService).

Структура проекта

ConfigurationManager.java – реализация Singleton.

LegacyChatService.java – устаревший сервис чата.

ChatService.java – новый целевой интерфейс.

ChatServiceAdapter.java – адаптер для взаимодействия между новым интерфейсом и устаревшей системой.

Main.java – демонстрационный класс.