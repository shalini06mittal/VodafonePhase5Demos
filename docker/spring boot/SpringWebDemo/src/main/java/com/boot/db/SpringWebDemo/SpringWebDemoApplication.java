package com.boot.db.SpringWebDemo;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.boot.db.SpringWebDemo.entity.Author;
import com.boot.db.SpringWebDemo.entity.Book;
import com.boot.db.SpringWebDemo.service.AuthorService;
import com.boot.db.SpringWebDemo.service.BookService;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.util.JSONPObject;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;


@SpringBootApplication
public class SpringWebDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context =
				SpringApplication.run(SpringWebDemoApplication.class, args);
//		AuthorService authorService = context.getBean(AuthorService.class);
//		Scanner sc = new Scanner(System.in);
//			System.out.println("Please choose one of the following:-");
//			System.out.println("1. View All Authors");
//			System.out.println("2. View All Authors By Genre");
//			System.out.println("3. View Author By id");
//			System.out.println("4. Add Author");
//			System.out.println("5. Update Author");
//			System.out.println("6. Delete Author");
//			int choice = sc.nextInt();
//			System.out.println("choice "+choice);
//			switch(choice)
//			{
//			case 1:
//				System.out.println("List Of authors\n");
//				for(Author author : authorService.getAllAuthor())
//				{
//					System.out.println(author);
//				}
//				break;
//			case 2:
//				System.out.println("Enter genre");
//				String genre = sc.next();
//				System.out.println("List Of authors By Genre\n");
//				for(Author author : authorService.getAuthorByGenre(genre))
//				{
//					System.out.println(author);
//				}
//				break;
//			case 3:
//				System.out.println("Enter author id to be viewed");
//				int id = sc.nextInt();
//				for(Author author:authorService.getAllAuthor())
//				{
//					if(author.getAid()== id)
//					{
//						System.out.println(author);
//						break;
//					}
//				}		
//		
//				break;
//			case 4:
//				System.out.println("Please provide following details of the author");
//				System.out.println("Enter id");
//				id = sc.nextInt();
//				System.out.println("Enter name");
//				String name = sc.next(); 
//				System.out.println("Enter city");
//				String city = sc.next();
//				System.out.println("Enter genre");
//				genre = sc.next();
//				Author author = new Author(id, name, city, genre);
//				if(authorService.insertAuthor(author)) {
//					System.out.println("author inserted successfully");
//					System.out.println("List after inserting");
//					for(Author obj : authorService.getAllAuthor())
//					{
//						System.out.println(obj);
//					}
//					
//				}
//				else
//					System.out.println("Could not insert author");
//
//				break;
//			case 5: 
//				System.out.println("List before updating");
//				for(Author obj : authorService.getAllAuthor())
//				{
//					System.out.println(obj);
//				}
//				System.out.println("Enter author id to be updated");
//				id = sc.nextInt();
//				System.out.println("Enter city to change");
//				city = sc.next();
//				Author a = authorService.findAuthorById(id);
//				a.setCity(city);
//				authorService.updateAuthor(a);
//				System.out.println("List after updating");
//				for(Author obj : authorService.getAllAuthor())
//				{
//					System.out.println(obj);
//				}
//				break;
//			case 6:
//				System.out.println("Enter author id to be deleted");
//				id = sc.nextInt();
//				if(authorService.deleteAuthor(id))
//					System.out.println("Author deleted successfully");
//				else
//					System.out.println("Could not delete author");
//				System.out.println("List after deleting");
//				for(Author obj : authorService.getAllAuthor())
//				{
//					System.out.println(obj);
//				}
//			default:
//				break;
//			}
	}
	@Autowired 
	private AuthorService aservice;

		@Autowired 
		private BookService bservice;


	@Bean
	public void initialize()
	{
		System.out.println("initialize");
		Author a1 = new Author(1, "RS", "Mumbai", "Suspense");
		Author a2 = new Author(2, "RS", "Delhi", "IT");
		Author a3 = new Author(3, "RS", "Mumbai", "IT");
		aservice.insertAuthor(a1);
		aservice.insertAuthor(a2);
		aservice.insertAuthor(a3);

				Book b1 = new Book("B001", "Twin Lights",a1, 234.23);
				Book b2 = new Book("B002", "Core Java", a2, 134.23);
				Book b3 = new Book("B003", "Adventures of Tom", a1, 543.23);
				Book b4 = new Book("B004", "HTML5", a3, 123.23);
				bservice.insertBook(b1);
				bservice.insertBook(b2);
				bservice.insertBook(b3);
				bservice.insertBook(b4);
	}



}
