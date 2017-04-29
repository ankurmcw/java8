package com.lambda;

import java.util.Arrays;
import java.util.List;

/**
 * Created by amarchattiwar on 4/26/17.
 */
public class Streams {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Ankur", "Marchattiwar", 30),
                new Person("Amrendra", "Yadav", 28),
                new Person("Abhishek", "Saxena", 27),
                new Person("Renuka", "Mehta", 27),
                new Person("Ankur", "Marchattiwar", 30),
                new Person("Amrendra", "Yadav", 28),
                new Person("Abhishek", "Saxena", 27),
                new Person("Renuka", "Mehta", 27),
                new Person("Ankur", "Marchattiwar", 30),
                new Person("Amrendra", "Yadav", 28),
                new Person("Abhishek", "Saxena", 27),
                new Person("Renuka", "Mehta", 27)
        );

        people.stream()
                .filter(p -> p.getFirstName().startsWith("A"))
                .forEach(p -> System.out.println(p.getFirstName()));

        long count = people.stream()
                .filter(p -> p.getLastName().startsWith("M"))
                .count();

        System.out.println(count);

        count = people.parallelStream()
                .filter(p -> p.getLastName().startsWith("M"))
                .count();

        System.out.println(count);

    }
}
