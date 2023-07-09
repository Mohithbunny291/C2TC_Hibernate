package com.cg.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import com.cg.entities.Book;

public class BookDaoImpl implements BookDao{

	private static EntityManager manager;
	
	public BookDaoImpl() {
		manager = JPAUtil.getEntityManager();
	}

	@Override
	public Book getBookId(int id) {
		
		Book book = manager.find(Book.class, id);
		return book;
	}

	@Override
	public List<Book> getBookByTitle(String title) {
		
		String qString = "select book from Book book where book.title LIKE : ptitle";
		
		TypedQuery<Book> query = manager.createQuery(qString, Book.class);
		
		query.setParameter("ptitle", "%"+title+"%");
		
		return query.getResultList();
	}

	@Override
	public Long getBookCount() {
		
		String qString = "select count(book.id) from Book book";
		
		TypedQuery<Long> query = manager.createQuery(qString, Long.class);
		
		Long count = query.getSingleResult();
		
		return count;
	}

	@Override
	public List<Book> getAuthorBooks(String author) {
		
		String qString = "select book from Book book where book.author =:pAuthor";
		
		TypedQuery<Book> query = manager.createQuery(qString, Book.class);
		
		query.setParameter("pAuthor", author);
		
		List<Book> booksList = query.getResultList();
		
		return booksList;
	}
	
	@Override
	public List<Book> getAllBooks() {
		
		Query query = manager.createNamedQuery("getAllBooks");
		
		List<Book> booksList = query.getResultList();
		
		return booksList;
	}
	
	@Override
	public List<Book> getBooksInPriceRange(double low, double high) {
		
		String qString = "Select book from Book book where book.price between :low and :high";
		
		TypedQuery<Book> query = manager.createQuery(qString, Book.class);
		
		query.setParameter("low", low);
		
		query.setParameter("high", high);
		
		List<Book> booksList = query.getResultList();
		
		return booksList;
	}

	

}
