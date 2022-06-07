package com.boot.db.SpringWebDemo.rest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.boot.db.SpringWebDemo.entity.Author;
import com.boot.db.SpringWebDemo.entity.ResponsePage;
import com.boot.db.SpringWebDemo.service.AuthorService;

/**
 * GET => fetch
 * POST => insert
 * PUT => updations
 * DELETE => deletions
 *
 */
// REST API => they return only string and not the views
// return data [ JSON / XML/ Plain text/ Images ]
@RestController // @Controller and @ResponseBody
@RequestMapping("/authors")
@CrossOrigin()
public class AuthorRestController {

	@Autowired
	private AuthorService authorService;
	
	@GetMapping("/count")
	public ResponseEntity<Object> authorCount()
	{
		long c = this.authorService.count();
		Map<String, Long> map = new HashMap<>();
		map.put("count", c);
		return new ResponseEntity<Object>(map, HttpStatus.OK);
	}
	
	// jackson libraries
	@GetMapping
	public List<Author> fetchAuthors()
	{
		return this.authorService.getAllAuthor();
	}
	
	//http://localhost:8081/authors/1
	// http://localhost:8081/authors?id=1
	//@GetMapping("/authors/{id}")
	// generalized mapping
	@RequestMapping(path = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Object> fetchAuthorById(@PathVariable int id)
	{
			return ResponseEntity.ok( this.authorService.findAuthorById(id));
		
	}
	
	@PostMapping
	public Author saveAuthor(@RequestBody Author author)
	{
		try {
			if(this.authorService.insertAuthor(author))
				return author;
		}
		catch(EntityExistsException e)
		{
			return null;
		}
		return null;
	}
	@PutMapping
	public Author updateAuthor(@RequestBody Author author)
	{
		try {
			if(this.authorService.updateAuthor(author))
				return author;
		}
		catch(EntityNotFoundException e)
		{
			return null;
		}
		return null;
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Object> deleteAuthor(@PathVariable int id){
		try {
			if(this.authorService.deleteAuthor(id))
				return ResponseEntity.ok("deletetion successful");
		}
		catch(EntityNotFoundException e)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
		}
		catch(Exception e)
		{
			//return new ResponseEntity<>(e.getMessage(), HttpStatus.CONFLICT);
			return ResponseEntity.status(HttpStatus.CONFLICT).body(e.getMessage());
		}
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Deletion failed");
	}
	
}
