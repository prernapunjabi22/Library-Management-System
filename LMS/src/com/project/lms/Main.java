package com.project.lms;

import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	      Library l1 = new Library("Btech");
	      Library l2 = new Library("Mtech");
	      
	      BookStore b = new BookStore();
	      b.addLibrary(l1);
	      b.addLibrary(l2);
	      

	    Book book1 = new Book("Basic Electrical Engineering", "Ritu Sehdev", "9789386173492");
	    Book book2 = new Book("Integral Calculus", "Shanti Narayana", "9788121906814");
	    Book book3 = new Book("Environmental Engineering", "AK Jain", "9789386173560");
	    Book book4 = new Book("Electrical Machines", "GC Garg", "9789386173447");
	    Book book5 = new Book("Let Us C", "Yashwant Kanetkar", "9788176569408");
	    
	    Book book6 = new Book("Advance Concepts in OS", "Mukesh Singhal", "9780070472686");
	    Book book7 = new Book("Cloud Computing", "Ashish Bhatnagar", "9789350146583");
	    Book book8 = new Book("Advance Algorithm", "Abirami A", "9789355517937");
	    Book book9 = new Book("Advance Computer Archietecture", "Rajiv Chopra","9788121930772");
	    Book book10 = new Book("Embedded System", "Anurag Arora", "9788185044712");

	    InventoryManager.addBookToLibrary(l1, book1);
	    InventoryManager.addBookToLibrary(l1, book2);
	    InventoryManager.addBookToLibrary(l1, book3);
	    InventoryManager.addBookToLibrary(l1, book4);
	    InventoryManager.addBookToLibrary(l1, book5);
	    
	    InventoryManager.addBookToLibrary(l2, book6);
	    InventoryManager.addBookToLibrary(l2, book7);
	    InventoryManager.addBookToLibrary(l2, book8);
	    InventoryManager.addBookToLibrary(l2, book9);
	    InventoryManager.addBookToLibrary(l2, book10);
	  
//	    b.getAllBooksInBookstore().values().forEach(System.out::println);
//	    b.getAllLibraries().values().forEach(System.out::println);
	    
	    
	    System.out.println("Choose the library you want to use: ");
	    System.out.println("Btech or Mtech");
	    String ch = sc.nextLine();
	    	
	    while(true) {
	    	switch(ch) {
	    	case "Btech": 
	    	
	    System.out.println("Choose the option for the following: ");
	    System.out.println("1. For issuing book,");
	    System.out.println("2. For returning book,");
	    System.out.println("3. For searching book,");
	    System.out.println("4. For displaying all books,");
	    System.out.println("5. For displaying available books,");
	    System.out.println("6. For displaying issued books,");
	    System.out.println("7. For exit.");
	    int choice = sc.nextInt();
	    
	    switch(choice) {
	    	case 1: 
	    			l1.issueBook();
	    			break;
	    			
	    	case 2:
					l1.returnBook();
	    			break;
	    			
	    			
	    	case 3:  
	    		System.out.println("Choose the following for searching: ");
	    			System.out.println("1. Search by ISBN,");
	    			System.out.println("2. Search by Author,");
	    			System.out.println("3. Search by Title.");
	    			int ch1 = sc.nextInt();
	    			SearchManager sm = new SearchManager();
	    			switch(ch1) {
	    			case 1:
	    					System.out.println(sm.searchBookByISBN(l1));
	    					break;
	    					
	    			case 2: 
	    					sm.searchBooksByAuthor(l1).forEach(System.out::println);
	    					break;
	    					
	    			case 3: 
	    					sm.searchBooksByTitle(l1).forEach(System.out::println);
	    					break;
	    			}
	    			break;
	    	
	    	case 4: l1.getAllBooks().values().forEach(System.out::println);;
	    			break;
	    			
	    	case 5: l1.getAvailableBooks();
	    			break;
	    			
	    	case 6: l1.getIssuedBooks();
	    			break;
	    			
	    	case 7: System.exit(0);
	    			break;
	   
	    	default: System.out.println("Invalid input...");
	    			break;
	    	}
	    	break;
	    	
	    	case "Mtech": 
	    		
	    		System.out.println("Choose the option for the following: ");
		    System.out.println("1. For issuing book,");
		    System.out.println("2. For returning book,");
		    System.out.println("3. For searching book,");
		    System.out.println("4. For displaying all books,");
		    System.out.println("5. For displaying available books,");
		    System.out.println("6. For displaying issued books,");
		    System.out.println("7. For exit.");
		    int choice1 = sc.nextInt();
		    
		    switch(choice1) {
		    	case 1: 
		    			l2.issueBook();
		    			break;
		    			
		    	case 2:
						l2.returnBook();
		    			break;
		    			
		    			
		    	case 3:  
		    		System.out.println("Choose the following for searching: ");
		    			System.out.println("1. Search by ISBN,");
		    			
		    			System.out.println("2. Search by Author,");
		    			System.out.println("3. Search by Title.");
		    			int ch2 = sc.nextInt();
		    			SearchManager sm = new SearchManager();
		    			switch(ch2) {
		    			case 1:
		    					System.out.println(sm.searchBookByISBN(l2));
		    					break;
		    					
		    			case 2: 
		    					sm.searchBooksByAuthor(l2).forEach(System.out::println);
		    					break;
		    					
		    			case 3: 
		    					sm.searchBooksByTitle(l2).forEach(System.out::println);
		    					break;
		    			}
		    			break;
		    	
		    	case 4: l2.getAllBooks().values().forEach(System.out::println);;
		    			break;
		    			
		    	case 5: l2.getAvailableBooks();
		    			break;
		    			
		    	case 6: l2.getIssuedBooks();
		    			break;
		    			
		    	case 7: System.exit(0);
		    			break;
		   
		    	default: System.out.println("Invalid input...");
		    			break;
		    	}
		    default: 
		    	System.out.println("Please re-launch the program, because you have choose invalid library!");
		    	System.exit(0);
		    	break;
	    	}
	    }
	   
	}
}

