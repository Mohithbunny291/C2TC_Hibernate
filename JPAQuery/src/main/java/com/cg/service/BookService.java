package com.cg.service;

import java.util.List;

import com.cg.entities.Book;

public interface BookService {

	public abstract Book getBookId(int id);
	
	public abstract List<Book> getBookByTitle(String title);
	
	public abstract Long getBookCount();
	
	public abstract List<Book> getAuthorBooks(String author);
	
	public abstract List<Book> getAllBooks();
	
	public abstract List<Book> getBooksInPriceRange(double low, double high);
	
}
