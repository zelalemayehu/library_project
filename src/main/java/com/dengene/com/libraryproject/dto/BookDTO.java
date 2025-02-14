package com.dengene.com.libraryproject.dto;

import com.dengene.com.libraryproject.model.Author;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class BookDTO {
    private Long Id;
    private String title;
    private String serialNumber;
    private Set<Author> authors;
}
