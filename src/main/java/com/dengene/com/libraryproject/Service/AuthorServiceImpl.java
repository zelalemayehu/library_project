package com.dengene.com.libraryproject.Service;

import com.dengene.com.libraryproject.model.Author;
import com.dengene.com.libraryproject.model.Book;
import com.dengene.com.libraryproject.dto.AuthorDTO;
import com.dengene.com.libraryproject.dto.BookDTO;
import com.dengene.com.libraryproject.repository.AuthorRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class AuthorServiceImpl implements AuthorService{

    private final AuthorRepository authorRepository;
    @Autowired
    private ModelMapper mapper;
    @Override
    public List<AuthorDTO> getAllAuthors() {
        return authorRepository.findAll().stream().map(author -> mapper.map(author, AuthorDTO.class)).collect(Collectors.toList());
    }

    @Override
    public AuthorDTO addAuthor(AuthorDTO authorDTO) {
        return mapper.map(authorRepository.save(mapper.map(authorDTO, Author.class)),AuthorDTO.class);
    }

    @Override
    public AuthorDTO updateAuthor(AuthorDTO authorDTO) {
        if(authorDTO.getId()!=null)    return mapper.map(authorRepository.save(mapper.map(authorDTO, Author.class)),AuthorDTO.class);
        return new AuthorDTO();
    }

    @Override
    public void deleteAuthor(AuthorDTO authorDTO) {

    }
}
