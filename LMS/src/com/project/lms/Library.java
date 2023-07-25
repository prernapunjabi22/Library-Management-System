package com.project.lms;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

	public class Library {
		Scanner scan = new Scanner(System.in);
	    private Map<String, Book> bookInventory;
	    private String libraryId;

	    public Library(String libraryId) {
	        bookInventory = new HashMap<>();
	        this.libraryId = libraryId;
	    }

	    public void addBook(Book book) {
	        bookInventory.put(book.getISBN(), book);
	    }

	    public Book removeBook(String ISBN) {
	        return bookInventory.remove(ISBN);
	    }

	    public Book getBookByISBN(String ISBN) {
	        return bookInventory.get(ISBN);
	    }

	    public Map<String, Book> getAllBooks() {
	        return bookInventory;
    }
	    
	    public Map<String, Book> getAvailableBooks(){
	    	return bookInventory;
	    }

		public String getLibraryId() {
			// TODO Auto-generated method stub
			return libraryId;
		}
		
		public void issueBook() {
			System.out.println("Enter the isbn no.: ");
			String isbn = scan.nextLine();
			Book book = bookInventory.get(isbn);
			if(book != null && book.getAvailable()) {
				book.setAvailable(false);
				System.out.println("Book issued successfully.");
			}
			else {
				System.out.println("Book can not be issued as it is already issued.");
			}
		}
		
		public void returnBook() {
			 System.out.println("Enter the isbn no.: ");
				String isbn2 = scan.nextLine();
			Book book = bookInventory.get(isbn2);
			if(book != null && !book.getAvailable()) {
				book.setAvailable(true);
				System.out.println("Book returned successfully.");
			}
			else {
				System.out.println("Book already returned.");
			}
		}
}

