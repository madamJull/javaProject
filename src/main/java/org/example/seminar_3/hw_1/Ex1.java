package org.example.seminar_3.hw_1;

import  org.example.seminar_3.hw_1.model.Good;

import java.util.ArrayList;

import java.util.List;

/**
 * 1. Дан массив записей: наименование товара, цена, сорт.
 * Найти наибольшую цену товаров 1го или 2го сорта среди товаров,
 * название которых содержит «высший».
 */
public class Ex1 {
    public static void main(String[] args) {
        Good good1 = new Good("масло",10, 1);
        Good good2 = new Good("хлеб высший",20, 1);
        Good good3 = new Good("йогурт высший",30, 2);
        Good good4 = new Good("молоко",40, 3);

        List<Good> listGood = new ArrayList<>();
        listGood.add(good1);
        listGood.add(good2);
        listGood.add(good3);
        listGood.add(good4);


        int maxPrice = 0;
        for (Good good : listGood) {
            if (good.getName().contains("высший")
                    & (good.getSort() == 1 | good.getSort() == 2)
                    & good.getPrice() > maxPrice) {
                maxPrice = good.getPrice();
            }
        }
        System.out.println("maxPrice: " + maxPrice);
    }
}

