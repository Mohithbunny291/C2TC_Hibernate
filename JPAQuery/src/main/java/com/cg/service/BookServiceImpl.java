package com.cg.service;

import java.util.List;

import com.cg.dao.BookDao;
import com.cg.dao.BookDaoImpl;
import com.cg.entities.Book;

public class BookServiceImpl implements BookService{

	private BookDao dao;
	
	public BookServiceImpl() {
		
		dao = new BookDaoImpl();
	}

	@Override
	public Book getBookId(int id) {
		
		return dao.getBookId(id);
	}

	@Override
	public List<Book> getBookByTitle(String title) {
		
		return dao.getBookByTitle(title);
	}

	@Override
	public Long getBookCount() {

		return dao.getBookCount();
	}

	@Override
	public List<Book> getAuthorBooks(String author) {
		
		return dao.getAuthorBooks(author);
	}

	@Override
	public List<Book> getAllBooks() {
		
		return dao.getAllBooks();
	}

	@Override
	public List<Book> getBooksInPriceRange(double low, double high) {

		return dao.getBooksInPriceRange(low, high);
	}

}
