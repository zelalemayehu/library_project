package com.dengene.com.libraryproject.Service;

import com.dengene.com.libraryproject.model.Book;
import com.dengene.com.libraryproject.dto.BookDTO;
import com.dengene.com.libraryproject.repository.BookRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookServiceImpl implements BookService{

    private final BookRepository bookRepository;
    @Autowired
    private ModelMapper mapper;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<BookDTO> getAllBook() {
        return bookRepository.findAll().stream().map(book -> mapper.map(book, BookDTO.class)).collect(Collectors.toList());
    }

    @Override
    public BookDTO addBook(BookDTO bookDTO) {

        return mapper.map(bookRepository.save(mapper.map(bookDTO, Book.class)),BookDTO.class);
    }

    @Override
    public BookDTO updateBook(BookDTO bookDTO) {

        if(bookDTO.getId()!=null)    return mapper.map(bookRepository.save(mapper.map(bookDTO, Book.class)),BookDTO.class);
        return new BookDTO();

    }

    @Override
    public void deleteBook(BookDTO bookDTO) {

        bookRepository.delete(mapper.map(bookDTO, Book.class));
    }
}
