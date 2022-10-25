package org.example_second;

import org.example.Author;
import org.example.Book;

public class Main {
    public static void main(String[] args) {
        Author author = new Author("Streleki");
        Book book = new Book(author, 195.00, "Le Why Cafe");
        System.out.println(book.getName());
    }
}














