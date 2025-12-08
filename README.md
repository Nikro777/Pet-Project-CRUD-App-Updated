Pet Project CRUD App - Spring Boot
Полнофункциональное Spring Boot приложение для управления складом товаров с двумя архитектурными подходами.

Технологии
Spring Boot 3.5.7

Java 21

PostgreSQL

Spring Data JPA

Lombok

Spring Validation

Maven

Архитектура
Версия 1: Плоская структура (Legacy)
/api/warehouse

Сущность: Warehouse (одна таблица warehouses_table)

Подход: Monolithic, все поля в одной таблице

Статус: Работает, поддерживается для обратной совместимости

Версия 2: Нормализованная структура (Current)
/api/products

Сущности: Product, Category, WarehousePlace

Подход: Нормализованные таблицы с JPA связями

Статус: Актуальная версия, рекомендуется к использованию

Запуск проекта
Установите PostgreSQL и создайте БД: pet_crud_app

Настройте application.yml с вашими данными

Запустите: mvn spring-boot:run

Приложение доступно: http://localhost:8080

Основные Endpoints
Новая модель (/api/products)
GET /list - список всех товаров

GET /{id} - детали товара

GET /category/{name} - товары по категории

GET /search?name=... - поиск по названию

GET /place/{number} - товары на месте склада

GET /low-stock?threshold=... - товары с низким запасом

GET /filter/price?min=...&max=... - фильтр по цене

POST / - создать товар

PUT /{id} - обновить товар

DELETE /{id} - удалить товар

PUT /{id}/move?newPlace=... - переместить

PUT /{id}/increase?amount=... - увеличить количество

PUT /{id}/decrease?amount=... - уменьшить количество

Старая модель (/api/warehouse)
GET / - все товары

GET /{id} - товар по ID

GET /category/{category} - по категории

GET /search?name=... - поиск

GET /place/{place} - по месту склада

POST / - создать

PUT /{id} - обновить

DELETE /{id} - удалить

Особенности
Две параллельные модели данных

Нормализованная структура с JPA связями

Разные DTO для разных случаев использования

Полная валидация входных данных

Бизнес-логика: перемещение, изменение количества

Демонстрирует эволюцию архитектуры, работу с Spring Boot, JPA, DTO, валидацией и параллельную поддержку разных версий API.
