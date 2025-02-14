package com.dengene.com.libraryproject.controller;

import com.dengene.com.libraryproject.Service.AuthorService;
import com.dengene.com.libraryproject.Service.BookService;
import com.dengene.com.libraryproject.dto.AuthorDTO;
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
@RequestMapping("library/v1/Auther")
public class AutherCpontroller {

    @Autowired
    private AuthorService authorService;

    @RequestMapping
    public ResponseEntity<List<AuthorDTO>> getAllAuther(){
        return new ResponseEntity<>(authorService.getAllAuthors(), HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<AuthorDTO> createResponse(@RequestBody AuthorDTO authorDTO){

        return new ResponseEntity<>(authorService.addAuthor(authorDTO), HttpStatus.CREATED);
    }
}
