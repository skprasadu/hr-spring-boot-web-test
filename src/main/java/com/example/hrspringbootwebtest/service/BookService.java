package com.example.hrspringbootwebtest.service;

import java.util.Set;

import com.example.hrspringbootwebtest.model.Book;

public interface BookService {

	void save(Book book);
	
	Book findById(Long id);
	
	Set<String> findTop3BooksBasedOnRating();
}
