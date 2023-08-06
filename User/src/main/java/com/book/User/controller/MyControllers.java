package com.book.User.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.book.User.dao.Book;
import com.book.User.services.Services;

@RestController
public class MyControllers {
	
	@Autowired
	private Services services;
	
	@GetMapping("/books")
	public List<Book> getBooks(){
		return this.services.getAllBooks();
	}
	
	@GetMapping("/books/{id}")
	public Book getBooksId(@PathVariable("id") int id){
		return this.services.getById(id);
	}
	
	@PostMapping("/books")
	public void addBook(@RequestBody Book book){
		this.services.insertBook(book);
		//return boo;
	}
	
	@DeleteMapping("/books/{id}")
	public void deleteBooks(@PathVariable("id") int id){
		 this.services.deleteBook(id);
	}
		
}
