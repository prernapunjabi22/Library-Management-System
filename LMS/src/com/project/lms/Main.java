package com.project.lms;

import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	      Library library = new Library("1234");

	    Book book1 = new Book("Java Programming", "John Doe", "1234567890");
	    Book book2 = new Book("Python Basics", "Jane Smith", "0987654321");
	    Book book3 = new Book("Data Structures in C", "Bob Johnson", "9876543210");

	    InventoryManager.addBookToLibrary(library, book1);
	    InventoryManager.addBookToLibrary(library, book2);
	    InventoryManager.addBookToLibrary(library, book3);
	    
	    while(true) {
	    System.out.println("Choose the option for the following: ");
	    System.out.println("1. For issuing book,");
	    System.out.println("2. For returning book,");
	    System.out.println("3. For searching book,");
	    System.out.println("4. For displaying all books,");
	    System.out.println("5. For displaying available books,");
	    System.out.println("6. For exit.");
	    int choice = sc.nextInt();
	    
	    switch(choice) {
	    	case 1: 
	    			library.issueBook();
	    			break;
	    			
	    	case 2:
					library.returnBook();
	    			break;
	    			
	    			
	    	case 3:  
	    		System.out.println("Choose the following for searching: ");
	    			System.out.println("1. Search by ISBN,");
	    			System.out.println("2. Search by Author,");
	    			System.out.println("3. Search by Title.");
	    			int ch = sc.nextInt();
	    			SearchManager sm = new SearchManager();
	    			switch(ch) {
	    			case 1:
	    					System.out.println(sm.searchBookByISBN(library));
	    					break;
	    					
	    			case 2: 
	    					sm.searchBooksByAuthor(library).forEach(System.out::println);
	    					break;
	    					
	    			case 3: 
	    					sm.searchBooksByTitle(library).forEach(System.out::println);
	    					break;
	    			}
	    			break;
	    	
	    	case 4: library.getAllBooks().values().forEach(System.out::println);;
	    			break;
	    			
	    	case 5: library.getAllBooks().values().forEach(System.out::println);
	    			break;
	    			
	    	case 6: System.exit(0);
	    			break;
	   
	    	default: System.out.println("Invalid input.");
	    			break;
	    	}
	    }
	   
	    
	}
}

