package com.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Created by amarchattiwar on 4/23/17.
 */
public class OutOfTheBoxInterface {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Ankur", "Marchattiwar", 30),
                new Person("Amrendra", "Yadav", 28),
                new Person("Abhishek", "Saxena", 27),
                new Person("Renuka", "Mehta", 27)
        );

        System.out.println("Printing list of people with first name starting with A - Java 8 Lambda");
        printConditionally(people, p -> p.getFirstName().startsWith("A"), p -> System.out.println(p.getFirstName()));

        System.out.println();
        System.out.println("Printing list of people with last name starting with M - Java 8 Lambda");
        printConditionally(people, p -> p.getLastName().startsWith("M"), p -> System.out.println(p.getLastName()));
    }

    private static void printConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
        for (Person p: people) {
            if (predicate.test(p)) {
                consumer.accept(p);
            }
        }
    }
}
