package com.dengene.com.libraryproject.repository;

import com.dengene.com.libraryproject.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository  extends JpaRepository<Author, Author> {
}
