package org.example.seminar_3.hw_2;

import org.example.seminar_3.hw_2.model.Goods;

import java.util.ArrayList;

import java.util.List;

import java.util.Scanner;

/**
 * 2. Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
 * Получить наименования товаров заданного сорта с наименьшей ценой.
 */

public class Ex2 {
    public static void main(String[] args) {
        Goods goods1 = new Goods("масло", 10, 1, 150.00, "Казахстан");
        Goods goods2 = new Goods("хлеб", 20, 2, 300.00, "Россия");
        Goods goods3 = new Goods("йогурт", 30, 1, 50.00, "Белоруссия");
        Goods goods4 = new Goods("молоко", 40, 3, 500.00, "Россия");

        List<Goods> listGoods = new ArrayList<>();
        listGoods.add(goods1);
        listGoods.add(goods2);
        listGoods.add(goods3);
        listGoods.add(goods4);

        Scanner scanner = new Scanner(System.in);
        int searchSort = scanner.nextInt();
        List<String> res = new ArrayList<>();
        int minPrice = -1;
        for(Goods good : listGoods){
            if (good.getSort() == searchSort){
                if(minPrice == -1) minPrice = good.getPrice();

                if(good.getPrice() < minPrice){
                    minPrice = good.getPrice();
                    res.clear();
                    res.add(good.getName());
                } else if (good.getPrice() == minPrice) {
                    res.add(good.getName());
                }
            }
        }
        System.out.println(res);
    }
}
