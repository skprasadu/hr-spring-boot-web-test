# Book Details - Spring Boot Project

## Overview

This exercise tests your knowledge of Spring Boot. It tests your understanding of RestController, Autowiring, Spring Data JPA, JPA queries. It also tests your Java streams basic knowledge like Optional.

This exercise has a Book entity, that as 4 attributes, Id, name, category, ratings. That also creates a table in the database with attributes of same name.

The test provides a Maven, Java based sand box including a H2 database for you to run 4 tests each carrying equal marks.
 
## Details

The details of the tests are as below:

* `test_1_RestController_SimpleEndpoint`: This test the knowledge of creating a simple JSON based rest end point. The structure of the JSON end point is, "{\"greeting\": \"hello Sam\"}". You need to return this JSON from your end point. The expectation is the create a RestController with and end point "/hello" that returns this JSON.

* `test_2_Autowired_Service`: This test the knowledge of Spring Autowired. It tests understanding of various layers like, Service, Repository and all its dependent classes like Entity, Id and others. If you progress on this test, you understand how to autowire various layers. It tests your knowledge of @Service,  @Entity, @Id, @Autowired on Repository. It also checks your toubleshooting skills on the console.

* `test_3_JPARepository_findById`: This tests your knowledge of Spring JPA/Hibernate layer. You have to use find by id method. It also forces you to use  repository save method, to save the Book entity. It tests the knowledge of JpaRepository methods like save, findById. Finally, it also tests Java8 Optional feature.

* `test_4_JPARepository_findTop3BooksBasedOnRating`: Finally, you need to write a Query to find to 3 Books that has most ratings. It tests your knowledge of SQL.