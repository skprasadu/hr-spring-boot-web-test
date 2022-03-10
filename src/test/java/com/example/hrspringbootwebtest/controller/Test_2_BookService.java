package com.example.hrspringbootwebtest.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import com.example.hrspringbootwebtest.model.Book;
import com.example.hrspringbootwebtest.service.BookService;

@SpringBootTest
public class Test_2_BookService {

    @Autowired
    private WebApplicationContext webApplicationContext;
    private MockMvc mvc;
    
    @Autowired
    private BookService bookService;

    @BeforeEach
    public void getContext() {
        mvc = webAppContextSetup(webApplicationContext).build();
        
        bookService.save(new Book(1l, "Java", "programming", 1));
        bookService.save(new Book(2l, ".Net", "programming", 3));
        bookService.save(new Book(3l, "Python", "programming", 5));
        bookService.save(new Book(4l, "Star Wars", "fiction", 5));
        bookService.save(new Book(5l, "Star Trak", "fiction", 5));
        bookService.save(new Book(6l, "Aus", "National geography", 5));
        bookService.save(new Book(7l, "India", "National geography", 5));
        bookService.save(new Book(8l, "Cricket", "Sports", 5));
    }
    
    /**
    * This test the knowledge of Spring Autowired, various layers like, Service, Repository and all its     
    * dependent classes like Entity, Identity and others. If you progress on this test, you understand     
    * how to autowire various layers.
    **/
    @Test
    public void test_2_Autowired_Service() {
        assertNotNull(bookService);
    }
    
    /**
    * This tests your knowledge of Spring JPA/Hibernate layer. You have to use find by id method. It also 
    * forces you to use  repository save method, to save the Book entity.
    *
    **/
    @Test
    public void test_3_JPARepository_findById() {
        
        Book book = bookService.findById(8l);
        
        assertEquals(book.getName(), "Cricket");
    }
    
    /**
    * you need to write a Query to find to 3 categories that has most books. It tests your knowledge of     
    * SQL with capabilities like Group by and aggregate.
    **/
    @Test
    public void test_4_JPARepository_findTop3BooksBasedOnRating() {
        Set<String> books = bookService.findTop3BooksBasedOnRating();
        
        assertEquals(books.size(), 3);
    }
}
