package com.example.library1;  // Вказуємо пакет, в якому знаходиться головний клас додатку

import org.springframework.boot.SpringApplication;  // Імпортуємо клас для запуску Spring Boot додатку
import org.springframework.boot.autoconfigure.SpringBootApplication;  // Імпортуємо анотацію для автоматичної конфігурації Spring Boot

@SpringBootApplication (scanBasePackages = "com.example.library1")  // Це анотація для основного класу Spring Boot додатку
public class LibraryApplication {
    // Основний метод для запуску Spring Boot додатку
    public static void main(String[] args) {
        SpringApplication.run(LibraryApplication.class, args);  // Запуск додатку
    }
}
// Приклади запитів Postman
//http://localhost:8081/library/search/author?author=F. Scott Fitzgerald
//http://localhost:8081/library/search/title?title=Gatsby
//http://localhost:8081/library/add
//{
//  "title": "1984",
//  "author": "George Orwell"
//}

//@SpringBootApplication — це основна анотація для налаштування Spring Boot додатку. Вона поєднує кілька важливих анотацій:
//@Configuration — позначає, що цей клас є конфігураційним класом для Spring.
//@EnableAutoConfiguration — дозволяє автоматичну конфігурацію, що дає можливість Spring самостійно налаштувати компоненти (наприклад, базу даних, сервери тощо).
//@ComponentScan — автоматично сканує всі підпакети вказаного пакету (в даному випадку com.example.library1), щоб знайти компоненти, сервіси та контролери для створення бінів.
//        SpringApplication.run(LibraryApplication.class, args); — цей метод запускає Spring Boot додаток, створюючи контекст додатку і ініціалізуючи всі компоненти та конфігурації.
