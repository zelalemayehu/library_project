package com.dengene.com.libraryproject.controller;

import com.dengene.com.libraryproject.Service.BookService;
import com.dengene.com.libraryproject.dto.AuthorDTO;
import com.dengene.com.libraryproject.dto.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @PutMapping
    public ResponseEntity<BookDTO> updateBook(@RequestBody BookDTO bookDTO){

        return new ResponseEntity<>(bookService.updateBook(bookDTO), HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<Map<String, String>> deleteBook(@RequestBody BookDTO bookDTO){

        Map<String, String> map = new HashMap<>();
        map.put("Message", "Author Successfully deleted Deleted");

        bookService.deleteBook(bookDTO);

        return new ResponseEntity<>(map, HttpStatus.OK);
    }
}
