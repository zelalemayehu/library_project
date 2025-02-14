package com.dengene.com.libraryproject.Service;

import com.dengene.com.libraryproject.dto.AuthorDTO;
import com.dengene.com.libraryproject.dto.BookDTO;

import java.util.List;

public interface AuthorService {
    List<AuthorDTO> getAllAuthors();
    AuthorDTO addAuthor(AuthorDTO authorDTO);
    AuthorDTO updateAuthor(AuthorDTO authorDTO);
    void deleteAuthor(AuthorDTO authorDTO);
}
