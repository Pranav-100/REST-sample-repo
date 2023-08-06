package com.book.User.repository;

import org.springframework.data.repository.CrudRepository;

import com.book.User.dao.Book;

public interface Repository extends CrudRepository<Book,Integer> {
	public Book findById(int id);
}
