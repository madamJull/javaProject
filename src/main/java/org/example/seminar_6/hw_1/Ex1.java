package org.example.seminar_6.hw_1;

import org.example.seminar_6.hw_1.model.Filter;

import org.example.seminar_6.hw_1.model.Notebook;

import java.util.HashSet;

import java.util.Set;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Set <Notebook> set = new HashSet<>();
        set.add(new Notebook("a", 16, "Linux", 1000, "black"));
        set.add(new Notebook("b", 16, "Linux", 1000, "black"));
        set.add(new Notebook("c", 32, "Windows", 1000, "silver"));
        set.add(new Notebook("d", 64, "MacOS", 1000, "white"));

        System.out.println(set);
        Filter operation = new Filter(set);
        operation.start();
    }
}
