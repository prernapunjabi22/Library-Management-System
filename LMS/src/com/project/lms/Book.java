package com.project.lms;

public class Book {
	    private String title;
	    private String author;
	    private String ISBN;
	    private boolean isAvailable;

	    public Book(String title, String author, String ISBN) {
	        this.title = title;
	        this.author = author;
	        this.ISBN = ISBN;
	        this.isAvailable = true;
	    }

	    // Getters and setters

	    @Override
	    public String toString() {
	        return "Book{"+"title = " + title + ", author=" + author +", ISBN=" + ISBN +'}';
	    }

		public String getISBN() {
			// TODO Auto-generated method stub
			return ISBN;
		}

		

		public String getTitle() {
			// TODO Auto-generated method stub
			return title;
		}

		public String getAuthor() {
			// TODO Auto-generated method stub
			return author;
		}
		
		public boolean getAvailable() {
			return isAvailable;
		}
		
		public void setAvailable(boolean available) {
			isAvailable = available;
		}

}
