package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.Book;
import com.app.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	private BookRepository bookRepo;

	@Override
	public Book addBook(Book book) {
		return bookRepo.save(book);
	}

	@Override
	public List<Book> getAllBooks() {
		return bookRepo.findAll() ;
	}

	@Override
	public Book getBooksByid(Long id) {
		return bookRepo.findById(id).orElse(null);
	}

	@Override
    public Book updateBook(Long id, Book book) {
        Book existing = bookRepo.findById(id).orElse(null);
        if (existing != null) {
            existing.setTitle(book.getTitle());
            existing.setAuthor(book.getAuthor());
            existing.setCategory(book.getCategory());
            existing.setAvailable(book.isAvailable());
            return bookRepo.save(existing);
        }
        return null;
    }

    @Override
    public void deleteBook(Long id) {
        bookRepo.deleteById(id);
    }
	
	

}
