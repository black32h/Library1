package com.example.library1.library;

import com.example.library1.book.BookService;  // Імпортуємо сервіс для роботи з книгами
import org.springframework.beans.factory.annotation.Autowired;  // Імпортуємо анотацію для автоматичного інжекції залежностей
import org.springframework.web.bind.annotation.*;  // Імпортуємо анотації для створення REST API контролерів
import com.example.library1.book.Book;  // Імпортуємо клас Book для використання в контролері

import java.util.List;  // Імпортуємо List для роботи зі списками книг

@RestController  // Анотація для визначення класу як REST контролер
@RequestMapping("/library")  // Вказуємо базовий шлях для всіх маршрутів в контролері
public class LibraryController {

    private BookService bookService;  // Оголошуємо змінну для сервісу роботи з книгами

    @Autowired  // Анотація для автоматичної ін'єкції залежності BookService через конструктор
    public LibraryController(BookService bookService) {
        this.bookService = bookService;  // Ініціалізуємо сервіс
    }

    // Метод для додавання нової книги в базу даних
    @PostMapping("/add")  // Визначаємо шлях для додавання книги через POST запит
    public Book addBook(@RequestBody Book book) {  // Приймаємо книгу в тілі запиту
        return bookService.saveBook(book);  // Зберігаємо книгу через сервіс і повертаємо збережену книгу
    }

    // Метод для отримання всіх книг
    @GetMapping("/books")  // Визначаємо шлях для отримання всіх книг через GET запит
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();  // Повертаємо список всіх книг
    }

    // Метод для пошуку книг за назвою
    @GetMapping("/search/title")  // Визначаємо шлях для пошуку книг за назвою через GET запит
    public List<Book> searchByTitle(@RequestParam String title) {  // Приймаємо параметр "title"
        return bookService.searchByTitle(title);  // Повертаємо список книг, що містять в назві введене значення
    }

    // Метод для пошуку книг за автором
    @GetMapping("/search/author")  // Визначаємо шлях для пошуку книг за автором через GET запит
    public List<Book> searchByAuthor(@RequestParam String author) {  // Приймаємо параметр "author"
        return bookService.searchByAuthor(author);  // Повертаємо список книг, що містять в авторі введене значення
    }
}
//@RestController — ця анотація позначає клас як контролер для обробки HTTP запитів у стилі REST. Це поєднує в собі функції @Controller та @ResponseBody, що означає, що кожен метод цього класу буде повертати відповідь без необхідності додатково позначати її анотацією @ResponseBody.
//@RequestMapping("/library") — вказує базовий шлях для всіх методів в цьому контролері. Усі маршрути в цьому контролері починаються з /library.
//@Autowired — використовується для автоматичної ін'єкції залежностей. В даному випадку інжектуємо сервіс BookService.
//@PostMapping("/add") — цей метод буде обробляти HTTP POST запити на шлях /library/add і прийматиме книгу через JSON в тілі запиту.
//@GetMapping("/books") — цей метод обробляє GET запити на шлях /library/books і повертає всі книги з бази даних.
//@GetMapping("/search/title") та @GetMapping("/search/author") — ці методи обробляють GET запити на шляхи /library/search/title і /library/search/author відповідно, і здійснюють пошук книг за назвою чи автором через параметри запиту.
