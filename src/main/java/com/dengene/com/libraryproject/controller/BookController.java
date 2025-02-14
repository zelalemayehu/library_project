package com.dengene.com.libraryproject.controller;

import com.dengene.com.libraryproject.Service.BookService;
import com.dengene.com.libraryproject.dto.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("library/v1/book")
public class BookController {
    @Autowired
    private  BookService bookService;


    @RequestMapping
    public ResponseEntity<List<BookDTO>> getAllBook(){
        return new ResponseEntity<>(bookService.getAllBook(), HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<BookDTO> createResponse(@RequestBody BookDTO bookDTO){

        return new ResponseEntity<>(bookService.addBook(bookDTO), HttpStatus.CREATED);
    }

}
