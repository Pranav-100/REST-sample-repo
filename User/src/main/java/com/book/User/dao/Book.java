package com.book.User.dao;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="books")
public class Book {
	//MySQLDialect
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String bName;
	private String author;
	
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(int id, String bName, String author) {
		super();
		this.id = id;
		this.bName = bName;
		this.author = author;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getbName() {
		return bName;
	}
	
	public void setbName(String bName) {
		this.bName = bName;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Services [id=" + id + ", bName=" + bName + ", author=" + author + "]";
	}
		
}
