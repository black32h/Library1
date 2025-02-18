package com.example.library1.library;

import jakarta.persistence.Entity;  // Імпортуємо анотацію @Entity для позначення класу як сутності бази даних
import jakarta.persistence.GeneratedValue;  // Імпортуємо анотацію для автоматичного генерації значення поля
import jakarta.persistence.GenerationType;  // Імпортуємо типи стратегії генерації значень
import jakarta.persistence.Table;  // Імпортуємо анотацію для позначення імені таблиці в базі даних
import org.springframework.data.annotation.Id;  // Імпортуємо анотацію @Id для позначення поля як ідентифікатора

@Entity  // Анотація, яка позначає клас як сутність, що зберігається в базі даних
@Table(name = "library")  // Анотація для вказівки імені таблиці в базі даних
public class Library {

    @jakarta.persistence.Id  // Анотація для позначення цього поля як ідентифікатора сутності
    @Id  // Анотація від Spring Data для позначення ідентифікатора
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Автоматичне генерування значення для ідентифікатора
    private Long id;  // Поле для ідентифікатора бібліотеки (унікальний номер)

    private String name;  // Поле для зберігання назви бібліотеки
    private String location;  // Поле для зберігання місцезнаходження бібліотеки

    // Геттер для отримання ідентифікатора бібліотеки
    public Long getId() {
        return id;
    }

    // Сеттер для встановлення ідентифікатора бібліотеки
    public void setId(Long id) {
        this.id = id;
    }

    // Геттер для отримання назви бібліотеки
    public String getName() {
        return name;
    }

    // Сеттер для встановлення назви бібліотеки
    public void setName(String name) {
        this.name = name;
    }

    // Геттер для отримання місцезнаходження бібліотеки
    public String getLocation() {
        return location;
    }

    // Сеттер для встановлення місцезнаходження бібліотеки
    public void setLocation(String location) {
        this.location = location;
    }
}

//@Entity — ця анотація позначає клас як сутність, що повинна бути збережена в базі даних. Без неї Spring Data JPA не буде розпізнавати цей клас як сутність для створення таблиці в базі.
//@Table(name = "library") — вказує, що ця сутність буде відображена в таблицю з іменем library в базі даних.
//@Id — позначає поле як ідентифікатор (первинний ключ) для таблиці.
//@GeneratedValue(strategy = GenerationType.IDENTITY) — визначає стратегію генерації значення для поля id. Стратегія IDENTITY означає, що база даних буде сама генерувати значення для цього поля (наприклад, через автоінкремент).
//Поле id — унікальний ідентифікатор для кожної бібліотеки.
//Поле name — для зберігання назви бібліотеки.
//Поле location — для зберігання місцезнаходження бібліотеки.
//Геттери та Сеттери — використовуються для доступу до полів об'єкта Library та для їхнього встановлення.
