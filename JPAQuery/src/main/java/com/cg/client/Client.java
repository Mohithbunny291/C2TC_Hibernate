package com.cg.client;

import com.cg.entities.*;
import com.cg.service.*;

public class Client {

	public static void main(String[] args) {

		BookService service = new BookServiceImpl();

		System.out.println("----- Listing total number of books -----");
		System.out.println(service.getBookCount());
		
		System.out.println();
		
		System.out.println("----- Listing book with ID 1005 -----");
		System.out.println(service.getBookId(1005));
		
		System.out.println();

		System.out.println("----- Listing all books -----");
		for (Book book : service.getAllBooks()) {

			System.out.println(book);
		}
		
		System.out.println();

		System.out.println("----- Listing book written by Danny -----");

		for (Book book : service.getAuthorBooks("Danny Coward")) {

			System.out.println(book);
		}
		
		System.out.println();

		System.out.println("----- Listing books named Android -----");

		for (Book book : service.getBookByTitle("Android")) {

			System.out.println(book);
		}
		
		System.out.println();

		System.out.println("----- Listing all books of pricies in between 1000 to 2000 -----");

		for (Book book : service.getBooksInPriceRange(1000, 2000)) {

			System.out.println(book);
		}

	}
}