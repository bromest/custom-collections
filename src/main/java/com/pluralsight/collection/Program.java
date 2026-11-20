package com.pluralsight.collection;

import java.time.LocalDate;

public class Program {
    public static void main(String[] args) {
        // Integer list test
        FixedList<Integer> numbers = new FixedList<>(3);

        numbers.add(10);
        numbers.add(3);
        numbers.add(92);
        numbers.add(43);

        System.out.println("Number of items: " + numbers.getItems().size());
        System.out.println(numbers.getItems());

        // LocalDate list test
        FixedList<LocalDate> dates = new FixedList<>(2);

        dates.add(LocalDate.of(2025, 1, 1));
        dates.add(LocalDate.of(2025, 12, 31));
        dates.add(LocalDate.now());

        System.out.println("Number of dates: " + dates.getItems().size());
        System.out.println(dates.getItems());

        // String list test
        FixedList<String> names = new FixedList<>(3);

        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        System.out.println("Names: " + names.getItems());
    }
}
