package com.example.hrspringbootwebtest.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.web.context.WebApplicationContext;

@SpringBootTest
public class Test_1_BookController {

    @Autowired
    private WebApplicationContext webApplicationContext;
    private MockMvc mvc;

    @BeforeEach
    public void getContext() {
        mvc = webAppContextSetup(webApplicationContext).build();
        
    }
    
    /**
    * This test the knowledge of creating a simple JSON based rest end point. The structure of the JSON     
    * end point is, {"greeting": "hello Sam"}. You need to return this JSON from your end point. The ex     
    * pectation is the create a RestController with and end point "hello" that returns this JSON.
    **/
    @Test
    public void test_1_RestController_SimpleEndpoint() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/hello")
                .accept(MediaType.APPLICATION_JSON)).andDo(print())
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.greeting").value("hello Sam"));
    }
}
