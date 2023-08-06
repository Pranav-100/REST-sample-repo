package com.book.User.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.book.User.dao.Book;
import com.book.User.repository.Repository;
import org.springframework.stereotype.Service;

@Service
public class Services {
	@Autowired
	private Repository repository;
	
	public List<Book>getAllBooks(){
		List<Book> result=(List<Book>)this.repository.findAll();
		return result;
	}
	//MySQL8Dialect
	public void insertBook(Book b){
		this.repository.save(b);
		 
	}
	
	public Book getById(int id) {
		Book b=this.repository.findById(id);
		return b;
	}
	
	public void deleteBook(int id) {
		this.repository.deleteById(id);
	}
	
	public void updateBook(Book book, int id) {
		book.setId(id);
		this.repository.save(book);
	}
	
	
}
