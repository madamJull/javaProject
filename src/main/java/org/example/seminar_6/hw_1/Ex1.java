package org.example.seminar_6.hw_1;

import org.example.seminar_6.hw_1.model.Filter;

import org.example.seminar_6.hw_1.model.Notebook;

import java.util.ArrayList;

import java.util.HashSet;

import java.util.List;
import java.util.Set;

public class Ex1 {
    public static void main(String[] args) {
        List notebooks = new ArrayList();
        notebooks.add(new Notebook("a", 16, 1000, "linux", "black"));
        notebooks.add(new Notebook("b", 32, 1000, "W", "silver"));

    Filter filter = new Filter();
        System.out.println(notebooks);
    }
}
