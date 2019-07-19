package com.mta.edu.reflection_vs_annotation;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Create list
        List<Book> bookList = new ArrayList<>();

        // Create books
        Book book1 = new Book();
        book1.setIsbn("001-256-789-123");
        book1.setName("Core Java Volumn I");
        book1.setAuthor("Phan Hai");
        book1.setPublisher("Oracle");
        bookList.add(book1);

        Book book2 = new Book();
        book2.setIsbn("002-257-789-123");
        book2.setName("Spring MVC Beginner's Guide");
        book2.setAuthor("Phan Mai");
        book2.setPublisher("Packt Pub");
        bookList.add(book2);

        Book book3 = new Book();
        book3.setIsbn("003-258-789123");
        book3.setName("Java 8 in Action");
        book3.setAuthor("Phan Anh");
        book3.setPublisher("Mainning Publication Co.");
        bookList.add(book3);

        // Create bookstore, assigning book
        BookStore bookStore = new BookStore();
        bookStore.setName("Tri Thuc");
        bookStore.setLocation("236 Hoang Quoc Viet");
        bookStore.setBookList(bookList);

        System.out.println(bookStore);
        System.out.println("booklist: ");
        for (Book book : bookList) {
            System.out.println(" + " + book);
        }

        System.out.println("\nConvert to xml: \n");
        String xml = ObjectToXmlHelper.convertToXml(bookStore);
        System.out.println(xml);
    }
}
