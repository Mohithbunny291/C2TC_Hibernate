package com.cg.service;

import java.util.List;

import com.cg.dao.BookDao;
import com.cg.dao.BookDaoImpl;
import com.cg.entities.Books;

public class BookServiceImpl implements BookService{

	private BookDao dao;
	
	public BookServiceImpl() {
		
		dao = new BookDaoImpl();
	}

	@Override
	public Books getBookId(int id) {
		
		return dao.getBookId(id);
	}

	@Override
	public List<Books> getBookByTitle(String title) {
		
		return dao.getBookByTitle(title);
	}

	@Override
	public Long getBookCount() {

		return dao.getBookCount();
	}

	@Override
	public List<Books> getAuthorBooks(String author) {
		
		return dao.getAuthorBooks(author);
	}

	@Override
	public List<Books> getAllBooks() {
		
		return dao.getAllBooks();
	}

	@Override
	public List<Books> getBooksInPriceRange(int low, int high) {

		return dao.getBooksInPriceRange(low, high);
	}

}
