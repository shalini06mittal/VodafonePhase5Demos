package com.boot.db.SpringWebDemo.database;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.boot.db.SpringWebDemo.entity.Book;



public interface BookRepository  extends CrudRepository<Book, String>{

	// select * from book where price >= ?
	public List<Book> getByPriceGreaterThanEqual(double price);
	public List<Book> findByAuthorAid(int id);
}
