package org.example.seminar_6.hw_1;

import org.example.seminar_6.hw_1.model.Filter;

import org.example.seminar_6.hw_1.model.Notebook;

import java.util.ArrayList;

import java.util.HashSet;

import java.util.Set;

public class Ex1 {
    public static void main(String[] args) {
        Filter filter = new Filter();
        filter.addNotebook(new Notebook("a", 8, 1000, "Linux", "black"));
        filter.addNotebook(new Notebook("b", 16, 1000, "Linux", "silver"));
        filter.addNotebook(new Notebook("c", 16, 1000, "Windows 10", "black"));
        filter.addNotebook(new Notebook("d", 32, 1000, "Windows 11", "white"));

        ArrayList list = filter.getNotebookByName("a");
        System.out.println(list);
    }
}
