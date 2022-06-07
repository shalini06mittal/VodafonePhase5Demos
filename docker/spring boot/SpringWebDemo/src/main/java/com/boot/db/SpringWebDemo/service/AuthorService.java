package com.boot.db.SpringWebDemo.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.db.SpringWebDemo.database.AuthorRepository;
import com.boot.db.SpringWebDemo.entity.Author;



@Service
public class AuthorService {

	@Autowired
	private AuthorRepository authorRepo;
	
	public long count()
	{
		return this.authorRepo.count();
	}
	public boolean insertAuthor(Author author)
	{
		if(this.authorRepo.existsById(author.getAid()))
				throw new EntityExistsException("Author with id "+author.getAid()+" already exists");
		this.authorRepo.save(author);
		return true;
	}
	public boolean updateAuthor(Author author)
	{
		if(!this.authorRepo.existsById(author.getAid()))
			throw new EntityNotFoundException("Cannot update as author with id "+author.getAid()+"does not exists");
		this.authorRepo.save(author);
		return true;
	}
	public boolean deleteAuthor(int id)
	{
		if(!this.authorRepo.existsById(id))
			throw new EntityNotFoundException("Cannot delete as author with id "+id+" does not exists");
		this.authorRepo.deleteById(id);
		return true;
	}
	public Author findAuthorById(int id)
	{
		return this.authorRepo.findById(id)
				.orElseThrow(() -> 
				new EntityNotFoundException("Cannot find as author with id "
				+id+" does not exists"));
	}
	public List<Author> getAllAuthor()
	{
		List<Author> authors = new ArrayList<>();
		this.authorRepo.findAll().forEach(author -> authors.add(author));
		return authors;
	}
	public List<Author> getAuthorByCity(String city)
	{
		return this.authorRepo.findByCity(city);
	}
	public List<Author> getAuthorByGenre(String genre)
	{
		return this.authorRepo.findByGenre(genre);
	}
	
}
