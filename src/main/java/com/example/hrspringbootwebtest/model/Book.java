package com.example.hrspringbootwebtest.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {
	private Long id;
	private String name;
	private String category;
	private Integer rating;
}
