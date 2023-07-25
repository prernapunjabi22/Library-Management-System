package com.project.lms;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SearchManager {
	Scanner sc = new Scanner(System.in);
    public List<Object> searchBooksByTitle(Library library) {
    	System.out.println("Enter the title: ");
    	String title = sc.nextLine();
        return library.getAllBooks().values()
                .stream()
                .filter(book -> book.getTitle().equalsIgnoreCase(title))
                .collect(Collectors.toList());
    }

    public List<Book> searchBooksByAuthor(Library library) {
    	System.out.println("Enter the author name: ");
    	String author = sc.nextLine();
        return library.getAllBooks().values()
                .stream()
                .filter(book -> book.getAuthor().equalsIgnoreCase(author))
                .collect(Collectors.toList());
    }

    public Book searchBookByISBN(Library library) {
    	System.out.println("Enter the ISBN no.: ");
    	String isbn = sc.nextLine();
        return library.getBookByISBN(isbn);
    }
}
