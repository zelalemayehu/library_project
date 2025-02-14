package com.dengene.com.libraryproject.controller;

import com.dengene.com.libraryproject.Service.AuthorService;
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
@RequestMapping("library/v1/Auther")
public class AutherCpontroller {

    @Autowired
    private AuthorService authorService;

    @RequestMapping
    public ResponseEntity<List<AuthorDTO>> getAllAuthor(){
        return new ResponseEntity<>(authorService.getAllAuthors(), HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<AuthorDTO> createAuthor(@RequestBody AuthorDTO authorDTO){

        return new ResponseEntity<>(authorService.addAuthor(authorDTO), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<AuthorDTO> updateAuthor(@RequestBody AuthorDTO authorDTO){

        return new ResponseEntity<>(authorService.updateAuthor(authorDTO), HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<Map<String, String>> deleteAuthor(@RequestBody AuthorDTO authorDTO){

        Map<String, String> map = new HashMap<>();
        map.put("Message", "Author Successfully deleted Deleted");

        authorService.deleteAuthor(authorDTO);

        return new ResponseEntity<>(map, HttpStatus.OK);
    }
}
