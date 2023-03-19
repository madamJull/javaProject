package org.example.seminar_3.hw_3.model;

import lombok.AllArgsConstructor;

import lombok.Data;

@AllArgsConstructor

@Data

public class Books {
    private String name;
    private String author;
    private Double price;
    private Integer year;
    private Integer pageCount;
}
