package com.boot.db.SpringWebDemo.database;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.boot.db.SpringWebDemo.entity.Author;



public interface AuthorRepository  extends CrudRepository<Author, Integer>{

	// select * from author where city=?
	public List<Author> findByCity(String city);
	public List<Author> findByGenre(String genre);
}
