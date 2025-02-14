package com.dengene.com.libraryproject.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="auther")
public class Author {
    @Id
    @GeneratedValue
    private Long Id;
    private String name;
    private String address;
}
