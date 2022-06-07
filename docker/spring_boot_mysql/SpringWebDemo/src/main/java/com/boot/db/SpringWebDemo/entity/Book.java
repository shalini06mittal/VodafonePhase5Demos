package com.boot.db.SpringWebDemo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Book {

	@Id
	private String bid;
	private String title;
	@OneToOne
	@JoinColumn(name ="author_id")
	private Author author;
	private double price;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String bid, String title, Author author, double price) {
		super();
		this.bid = bid;
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public String getBid() {
		return bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [bid=" + bid + ", title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	
}
