package com.cg.dao;

import com.cg.entities.Books;
import java.util.List;

public interface BookDao {

	public abstract Books getBookId(int id);
	
	public abstract List<Books> getBookByTitle(String title);
	
	public abstract Long getBookCount();
	
	public abstract List<Books> getAuthorBooks(String author);
	
	public abstract List<Books> getAllBooks();
	
	public abstract List<Books> getBooksInPriceRange(int low, int high);
}
