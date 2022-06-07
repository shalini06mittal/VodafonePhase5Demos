package com.boot.db.SpringWebDemo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Author {
	@Id
	@NotNull
	private int aid;
	private String aname;
	private String city;
	private String genre;
	
	public Author() {
		
	}

	public Author(int aid, String aname, String city, String genre) {
	
		this.aid = aid;
		this.aname = aname;
		this.city = city;
		this.genre = genre;
	}


	public int getAid() {
		return aid;
	}


	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Author [aid=" + aid + ", aname=" + aname + ", city=" + city + ", genre=" + genre + "]";
	}
	

}
