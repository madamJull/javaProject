package org.example.seminar_3.hw_3;

import org.example.seminar_3.hw_3.model.Books;

import java.util.ArrayList;

import java.util.List;

/**
 * 3. Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
 * Найти названия книг, в которых простое количество страниц, фамилия автора содержит «А»
 * и год издания после 2010 г, включительно.
 */

public class Ex3 {
    public static void main(String[] args) {
        Books book1 = new Books("Пиковая дама", "А.С.Пушкин", 350.00, 2010, 13);
        Books book2 = new Books("Мцыри", "М.Ю.Лермонтов",120.00,2012,157);
        Books book3 = new Books("Разговоры с доном Хуаном", "К.Кастанеда",280.00,2015,17);
        Books book4 = new Books("Последний из могикан", "Дж.Купер",430.00,2001,485);

        List<Books> listBooks = new ArrayList<>();
        listBooks.add(book1);
        listBooks.add(book2);
        listBooks.add(book3);
        listBooks.add(book4);

        List<String> result = new ArrayList<>();
        for(Books book : listBooks){
            if(isSimple(book.getPageCount())
                    & (book.getAuthor().contains("А") | book.getAuthor().contains("а"))
                    & book.getYear() >= 2010) {
            result.add(book.getName());
            }
        }
        System.out.println(result);
    }

    public static boolean isSimple(int a) {
        Double sqrt = Math.sqrt(a);
        for (int i = 2; i <= sqrt.intValue(); i++) {
            if (a % i == 0) return false;
        }
        return true;
    }
}
