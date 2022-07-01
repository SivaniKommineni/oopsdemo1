package oopsdemo2;

import java.util.List;

public class Library {

	List<Book> books; //Object Reference -- Composition

	public Library(List<Book> books) {
		this.books = books;
	}

	public List<Book> getBooks() {
		return books;
	}
	
    
	
}
