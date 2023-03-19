package org.example.seminar_3.cw_1;

import org.example.seminar_3.cw_1.model.Items;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Ex1 {
    /**
     * 1.	Даны сведения об экспортируемых товарах: указывается наименование товара, страна, экспортирующая товар, и объем поставляемой партии в штуках.
     * Найти страны, которые экспортируют данный(введенный с кл-ы) товар, и общий объем его экспорта.
     */
    public static void main(String[] args) {
        Items items1 = new Items("hjk", "hjj", 1.0);
        Items items2 = new Items("hjk1", "wer", 1.0);
        Items items3 = new Items("hjk2", "yui", 1.0);
        Items items4 = new Items("hjk", "nmv", 1.0);

        List<Items> itemsList = new ArrayList<>();
        itemsList.add(items1);
        itemsList.add(items2);
        itemsList.add(items3);
        itemsList.add(items4);

        Scanner scanner = new Scanner(System.in);
        String searchName = scanner.nextLine();
        int sumVolume = 0;
        List<String> country = new ArrayList<>();

        for (int i = 0; i < itemsList.size(); i++){
            if(itemsList.get(i).getName().equals(searchName)){
                sumVolume += itemsList.get(i).getVolume();
                country.add(itemsList.get(i).getCountry());
            }
        }
        System.out.println("sum = " + sumVolume);
        System.out.println("country = " + country);
    }
}