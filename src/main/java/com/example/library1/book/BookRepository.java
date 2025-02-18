package com.example.library1.book;

import org.springframework.data.jpa.repository.JpaRepository;  // Імпортуємо JpaRepository, щоб мати доступ до стандартних CRUD операцій
import org.springframework.stereotype.Repository;  // Імпортуємо анотацію @Repository для позначення класу як репозиторія

import java.util.List;  // Імпортуємо List для повернення списків

@Repository  // Анотація для позначення класу як репозиторія, який виконує операції з базою даних
public interface BookRepository extends JpaRepository<Book, Long> {  // Інтерфейс розширює JpaRepository для роботи з об'єктами Book

    // Метод для пошуку книг за частковим збігом назви (незалежно від регістру)
    List<Book> findByTitleContainingIgnoreCase(String title);

    // Метод для пошуку книг за частковим збігом автора (незалежно від регістру)
    List<Book> findByAuthorContainingIgnoreCase(String author);
}

//@Repository — ця анотація позначає інтерфейс як репозиторій, що надає доступ до бази даних. Spring автоматично створить реалізацію цього інтерфейсу під час запуску програми.
//        extends JpaRepository<Book, Long> — інтерфейс розширює JpaRepository, що є стандартним інтерфейсом для роботи з базою даних за допомогою JPA. Це дозволяє отримати доступ до основних CRUD (Create, Read, Update, Delete) операцій без написання додаткового коду.
//Book — клас сутність, з яким працює репозиторій.
//        Long — тип даних для ідентифікатора (primary key).
//findByTitleContainingIgnoreCase(String title) — цей метод шукає книги за частковим збігом назви (із ігноруванням регістру символів). Наприклад, якщо ми передамо "Java", він знайде книги, у яких є "java", "JAVA", "JaVa" тощо в назві.
//findByAuthorContainingIgnoreCase(String author) — цей метод шукає книги за частковим збігом автора (також із ігноруванням регістру символів). Наприклад, якщо передати "Tolkien", метод знайде всі книги, де автор містить "tolkien", "TOLKIEN" тощо.
