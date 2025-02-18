package com.example.library1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication (scanBasePackages = "com.example.library1")  // Це забезпечує сканування всіх підпакетів
public class LibraryApplication1 {
    public static void main(String[] args) {
        SpringApplication.run(LibraryApplication1.class, args);
    }
}
