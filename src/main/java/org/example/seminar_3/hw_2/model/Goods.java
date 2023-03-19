package org.example.seminar_3.hw_2.model;

import lombok.AllArgsConstructor;

import lombok.Data;

@AllArgsConstructor

@Data

public class Goods {
    private String name;
    private Integer price;
    private Integer sort;
    private Double weight;
    private String country;
}