package com.boot.db.SpringWebDemo.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.db.SpringWebDemo.database.BookRepository;
import com.boot.db.SpringWebDemo.entity.Book;


@Service
public class BookService {

	@Autowired
	private BookRepository bookRepo;
	
	public long count()
	{
		return this.bookRepo.count();
	}
	public boolean insertBook(Book book)
	{
		if(this.bookRepo.existsById(book.getBid()))
				throw new EntityExistsException("Author with id "+book.getBid()+" already exists");
		this.bookRepo.save(book);
		return true;
	}
	public boolean updateBook(Book book)
	{
		if(!this.bookRepo.existsById(book.getBid()))
			throw new EntityNotFoundException("Cannot update as author with id "+book.getBid()+"does not exists");
		this.bookRepo.save(book);
		return true;
	}
	public boolean deleteBook(Book book)
	{
		if(!this.bookRepo.existsById(book.getBid()))
			throw new EntityNotFoundException("Cannot update as author with id "+book.getBid()+"does not exists");
		this.bookRepo.delete(book);
		return true;
	}
	public Book findBookById(String id)
	{
		return this.bookRepo.findById(id)
				.orElseThrow(() -> 
				new EntityNotFoundException("Cannot update as author with id "
				+id+"does not exists"));
	}
	public List<Book> getAllBooks()
	{
		List<Book> books = new ArrayList<>();
		this.bookRepo.findAll().forEach(author -> books.add(author));
		return books;
	}
	// Indian format
	public List<Book> getBooksByPriceGreaterThanEqualTo(double price)
	{
		return this.bookRepo.getByPriceGreaterThanEqual(price);
	}
	public List<Book> getBooksByAuthor(int id)
	{
		return this.bookRepo.findByAuthorAid(id);
	}
}
