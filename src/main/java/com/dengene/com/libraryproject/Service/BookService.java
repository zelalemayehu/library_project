package com.dengene.com.libraryproject.Service;

import com.dengene.com.libraryproject.dto.BookDTO;

import java.util.List;

public interface BookService {
    List<BookDTO> getAllBook();
    BookDTO addBook(BookDTO bookDTO);
    BookDTO updateBook(BookDTO bookDTO);
    void deleteBook(BookDTO bookDTO);

}
