package com.app.service;

import java.util.List;

import com.app.entity.Book;

public interface BookService {
	
	Book addBook(Book book);
	List<Book> getAllBooks();
	Book getBooksByid(Long id);
	Book updateBook(Long id, Book book);
	void deleteBook(Long id);

}
