package com.project.lms;

	import java.util.HashMap;
	import java.util.Map;
	import java.util.stream.Collectors;

	public class BookStore {
	    private Map<String, Library> libraries;

	    public BookStore() {
	        libraries = new HashMap<>();
	    }

	    // Add a library to the bookstore
	    public void addLibrary(Library library) {
	        libraries.put(library.getLibraryId(), library);
	    }

	    // Remove a library from the bookstore
	    public void removeLibrary(String libraryId) {
	        libraries.remove(libraryId);
	    }

	    // Get all books available in the entire bookstore
	    public Map<String, Book> getAllBooksInBookstore() {
	        return libraries.values()
	                .stream()
	                .flatMap(library -> library.getAllBooks().values().stream())
	                .collect(Collectors.toMap(Book::getISBN, book -> book));
	    }

	    // Other methods as needed
	    // ...
}

