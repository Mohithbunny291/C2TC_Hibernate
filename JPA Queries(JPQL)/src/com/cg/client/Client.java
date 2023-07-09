package com.cg.client;

import com.cg.entities.Books;
import com.cg.service.BookService;
import com.cg.service.BookServiceImpl;

public class Client {

	public static void main(String[] args) {

		BookService service = new BookServiceImpl();

		System.out.println("----- Listing total number of books -----");
		System.out.println(service.getBookCount());
		

		System.out.println("----- Listing book with ID 1005 -----");
		System.out.println(service.getBookId(1005));
		

		System.out.println("----- Listing all books -----");
		for (Books books : service.getAllBooks()) {

			System.out.println(books);
		}
		

		System.out.println("----- Listing book written by Danny -----");

		for (Books books : service.getAuthorBooks("Danny")) {

			System.out.println(books);
		}
		

		System.out.println("----- Listing books named Android -----");

		for (Books books : service.getBookByTitle("Android")) {

			System.out.println(books);
		}
		

		System.out.println("----- Listing all books of pricies in between 1000 to 2000");

		for (Books books : service.getBooksInPriceRange(1000, 2000)) {

			System.out.println(books);
		}

	}
}