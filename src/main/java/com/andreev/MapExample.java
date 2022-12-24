package com.andreev;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MapExample {

    public static void main(String[] args) {
        Integer[] key = {1, 2, 3, 4, 5, 6, 7};
        String[] value = {"one", "two", "tree", "four", "one", "two", "One"};

        Map<Integer, String> hashMap = new HashMap<>();

        for (int i = 0; i < key.length; i++) {
            hashMap.put(key[i], value[i]);
        }

        System.out.println("Сравнение записи строковых данных в разные типы коллекций");
        System.out.println("Размер HashMap: " + hashMap.size());
        System.out.println("Весь HashMap: " + hashMap);
        System.out.println("Ключи HashMap: " + hashMap.keySet());
        System.out.println("Значения HashMap по ключу 3: " + hashMap.get(3));
        System.out.println("Проверка: значения HashMap по ключу 6 = two: " + (Objects.equals(hashMap.get(6), "two")));
    }
}
