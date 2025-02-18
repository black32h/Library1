package com.example.library1.book;

import jakarta.persistence.*;  // Імпортуємо необхідні анотації для роботи з JPA

@Entity  // Ця анотація вказує, що цей клас є сутністю, яку буде збережено в базі даних
@Table(name = "library")  // Вказуємо, що ця сутність буде відображена на таблицю "library" в базі даних
public class Book {

    @Id  // Вказуємо, що це поле є первинним ключем
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Вказуємо, що значення для цього поля буде генеруватися автоматично через автоінкремент (для баз даних, що підтримують AUTO_INCREMENT, як-от PostgreSQL)
    private Long id;  // Поле для збереження ідентифікатора книги (PK)

    private String title;  // Поле для збереження назви книги

    private String author;  // Поле для збереження автора книги

    // Конструктор без параметрів (необхідний для роботи з JPA)
    public Book() {}

    // Конструктор з параметрами для зручності створення об'єкта Book з назвою та автором
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Геттер для id
    public Long getId() {
        return id;
    }

    // Сеттер для id
    public void setId(Long id) {
        this.id = id;
    }

    // Геттер для title
    public String getTitle() {
        return title;
    }

    // Сеттер для title
    public void setTitle(String title) {
        this.title = title;
    }

    // Геттер для author
    public String getAuthor() {
        return author;
    }

    // Сеттер для author
    public void setAuthor(String author) {
        this.author = author;
    }
}

//@Entity — ця анотація вказує, що клас є сутністю для ORM (Object-Relational Mapping), тобто клас буде відображений на таблицю в базі даних.
//@Table(name = "library") — вказує, що даний клас буде використовувати таблицю library в базі даних.
//@Id — вказує, що поле id є первинним ключем таблиці, і кожен запис в таблиці буде мати унікальний ідентифікатор.
//@GeneratedValue(strategy = GenerationType.IDENTITY) — вказує, що значення для id буде автоматично генеруватись базою даних, коли створюється новий запис.
//Конструктори — є два конструктори: один без параметрів (необхідний для роботи з JPA, оскільки JPA має використовувати цей конструктор для створення об'єктів), і один з параметрами для зручності створення об'єкта з назвою та автором книги.
//        Геттери та сеттери — це стандартні методи для доступу до полів класу. Вони використовуються для читання та зміни значень полів.
