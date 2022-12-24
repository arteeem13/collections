package com.andreev;

import java.util.*;

public class ListStringExample {

    public static void main(String[] args) {
        String[] values = {"Book", "Cat", "Door" ,"apple" , "born", "dog", "Cat", "Book"};

        List<String> stringArrayList = new ArrayList<>();
        Set<String> stringHashSet = new HashSet<>();
        Set<String> stringLinkedHashSet = new LinkedHashSet<>();
        Set<String> stringTreeSet = new TreeSet<>();

        for (String value : values) {
            stringArrayList.add(value);
            stringHashSet.add(value);
            stringLinkedHashSet.add(value);
            stringTreeSet.add(value);
        }

        System.out.println("Сравнение записи строковых данных в разные типы коллекций");
        System.out.println("ArrayList: " + stringArrayList);
        System.out.println("HashSet без повторений, неупорядоченный, неотсортированный список: " + stringHashSet);
        System.out.println("LinkedHashSet без повторений, вывод в порядке добавления: " + stringLinkedHashSet);
        System.out.println("TreeSet без повторений, отсортированный: " + stringTreeSet);

    }
}
