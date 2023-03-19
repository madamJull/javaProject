package org.example.seminar_3.cw_2.model;

import lombok.AllArgsConstructor;

import lombok.Data;

import java.util.List;

/**
 * амилия студента, номер группы, размер стипендии,
 * баллы по 3 предметам
 */

@Data
@AllArgsConstructor
public class Student {
    private String surname;
    private int groupNumber;
    private double money;
    private List<Integer> evaluations;
}
