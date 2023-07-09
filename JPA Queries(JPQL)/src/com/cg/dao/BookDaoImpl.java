package com.cg.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import com.cg.entities.Books;

public class BookDaoImpl implements BookDao{

	private EntityManager manager;
	
	public BookDaoImpl() {
		manager = JPAUtil.getEntityManager();
	}

	@Override
	public Books getBookId(int id) {
		
		Books books = manager.find(Books.class, id);
		return books;
	}

	@Override
	public List<Books> getBookByTitle(String title) {
		
		String qString = "select book from Books book where book.title LIKE : ptitle";
		
		TypedQuery<Books> query = manager.createQuery(qString, Books.class);
		
		query.setParameter("ptitle", "%"+title+"%");
		
		return query.getResultList();
	}

	@Override
	public Long getBookCount() {
		
		String qString = "select count(book.id) from Books book";
		
		TypedQuery<Long> query = manager.createQuery(qString, Long.class);
		
		Long count = query.getSingleResult();
		
		return count;
	}

	@Override
	public List<Books> getAuthorBooks(String author) {
		
		String qString = "select book from Books book where book.author =:pAuthor";
		
		TypedQuery<Books> query = manager.createQuery(qString, Books.class);
		
		query.setParameter("pAuthor", author);
		
		List<Books> booksList = query.getResultList();
		
		return booksList;
	}
	
	@Override
	public List<Books> getAllBooks() {
		
		Query query = manager.createNamedQuery("getAllBooks");
		
		List<Books> booksList = query.getResultList();
		
		return booksList;
	}
	
	@Override
	public List<Books> getBooksInPriceRange(int low, int high) {
		
		String qString = "Select book from Books book where books.price between :low and :high";
		
		TypedQuery<Books> query = manager.createQuery(qString, Books.class);
		
		query.setParameter("low", low);
		
		query.setParameter("high", high);
		
		List<Books> booksList = query.getResultList();
		
		return booksList;
	}

	

}
