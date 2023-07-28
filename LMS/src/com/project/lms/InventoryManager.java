package com.project.lms;

	public class InventoryManager {
	    public static void addBookToLibrary(Library library, Book book) {
	        library.addBook(book);
	    }

	    public static Book removeBookFromLibrary(Library library, String ISBN) {
	        return library.removeBook(ISBN);
	    }
	}
	
	
	

