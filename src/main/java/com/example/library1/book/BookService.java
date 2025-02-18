package com.example.library1.book;

import org.springframework.beans.factory.annotation.Autowired;  // Імпортуємо анотацію @Autowired для автоматичного впровадження залежностей
import org.springframework.stereotype.Service;  // Імпортуємо анотацію @Service для позначення класу як сервісного компонента

import java.util.List;  // Імпортуємо List для використання списків

@Service  // Анотація для позначення класу як сервісу, що містить бізнес-логіку
public class BookService {

    @Autowired  // Автоматично впроваджуємо залежність BookRepository в цей клас
    private BookRepository repository;  // Репозиторій для доступу до бази даних, де зберігаються книги

    // Метод для збереження нової книги в базу даних
    public Book saveBook(Book book) {
        return repository.save(book);  // Використовуємо метод save() репозиторію для збереження книги
    }

    // Метод для отримання всіх книг з бази даних
    public List<Book> getAllBooks() {
        return repository.findAll();  // Використовуємо метод findAll() для отримання всіх книг
    }

    // Метод для пошуку книг за частковим збігом назви
    public List<Book> searchByTitle(String title) {
        return repository.findByTitleContainingIgnoreCase(title);  // Використовуємо метод findByTitleContainingIgnoreCase для пошуку за назвою
    }

    // Метод для пошуку книг за частковим збігом автора
    public List<Book> searchByAuthor(String author) {
        return repository.findByAuthorContainingIgnoreCase(author);  // Використовуємо метод findByAuthorContainingIgnoreCase для пошуку за автором
    }
}

//@Service — ця анотація позначає клас як сервіс, який містить бізнес-логіку. У Spring цей клас буде оброблений як бін і доданий до контексту додатку для впровадження залежностей.
//@Autowired — ця анотація використовується для автоматичного впровадження залежності. У даному випадку ми впроваджуємо BookRepository в клас BookService. Spring автоматично надасть потрібну реалізацію цього репозиторію.
//saveBook(Book book) — метод, який зберігає нову книгу в базі даних, викликаючи метод save() репозиторію. Це дозволяє додавати нові записи в таблицю.
//getAllBooks() — метод для отримання всіх книг з бази даних за допомогою методу findAll(). Це дозволяє отримати список всіх книг у бібліотеці.
//searchByTitle(String title) — метод для пошуку книг за частковим збігом назви (незалежно від регістру символів), використовуючи метод репозиторію findByTitleContainingIgnoreCase().
//searchByAuthor(String author) — метод для пошуку книг за частковим збігом автора, використовуючи метод репозиторію findByAuthorContainingIgnoreCase().
