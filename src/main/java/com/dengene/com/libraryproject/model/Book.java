package com.dengene.com.libraryproject.model;


import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="book")
public class Book {

    @Id
    @GeneratedValue
    private Long Id;
    private String title;
    @Column(name="serial_number")
    private String serialNumber;
    @ManyToMany
    private Set<Author> authors;
}
