package com.cg.dao;

import com.cg.entities.Book;
import java.util.List;

public interface BookDao {

	public abstract Book getBookId(int id);
	
	public abstract List<Book> getBookByTitle(String title);
	
	public abstract Long getBookCount();
	
	public abstract List<Book> getAuthorBooks(String author);
	
	public abstract List<Book> getAllBooks();
	
	public abstract List<Book> getBooksInPriceRange(double low, double high);
}
