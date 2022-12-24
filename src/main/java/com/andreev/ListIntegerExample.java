package com.andreev;

import java.util.*;

public class ListIntegerExample {

    public static void main(String[] args) {
        Integer[] values = {1, 47, 55 ,5 , 9, 6, 9 , 28, 9, 1};
        List<Integer> integerArrayList = new ArrayList<>();
        Set<Integer> integerHashSet = new HashSet<>();
        Set<Integer> integerLinkedHashSet = new LinkedHashSet<>();
        Set<Integer> integerTreeSet = new TreeSet<>();
        for (Integer value : values) {
            integerArrayList.add(value);
            integerHashSet.add(value);
            integerLinkedHashSet.add(value);
            integerTreeSet.add(value);
        }
        System.out.println("Сравнение записи числовых данныx в разные типы коллекций");
        System.out.println("ArrayList: " + integerArrayList);
        System.out.println("HashSet без повторений, неупорядоченный, неотсортированный список: " + integerHashSet);
        System.out.println("LinkedHashSet без повторений, вывод в порядке добавления: " + integerLinkedHashSet);
        System.out.println("TreeSet без повторений, отсортированный: " + integerTreeSet);
    }
}