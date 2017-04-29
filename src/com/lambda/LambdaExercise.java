package com.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by amarchattiwar on 4/23/17.
 */
public class LambdaExercise {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Ankur", "Marchattiwar", 30),
                new Person("Amrendra", "Yadav", 28),
                new Person("Abhishek", "Saxena", 27),
                new Person("Renuka", "Mehta", 27)
        );

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });

        System.out.println("Printing list of people in sorted order of last name - Java 7");
        printAll(people);

        Collections.sort(people, (o1, o2) -> o1.getFirstName().compareTo(o2.getFirstName()));
        System.out.println();
        System.out.println("Printing list of people in sorted order of first name - Java 8 Lambda");
        printConditionally(people, p -> true);

        System.out.println();
        System.out.println("Printing list of people with last name starting with M - Java 7");
        printConditionally(people, new Condition() {
            @Override
            public boolean test(Person p) {
                return p.getLastName().startsWith("M");
            }
        });

        System.out.println();
        System.out.println("Printing list of people with last name starting with M - Java 8 Lambda");
        printConditionally(people, p ->  p.getLastName().startsWith("M"));

        System.out.println();
        System.out.println("Printing list of people with first name starting with A - Java 8 Lambda");
        printConditionally(people, p ->  p.getFirstName().startsWith("A"));

    }

    private static void printConditionally(List<Person> people, Condition condition) {
        for (Person p: people) {
            if (condition.test(p)) {
                System.out.println(p);
            }
        }
    }

    private static void printAll(List<Person> people) {
        for (Person p: people) {
            System.out.println(p);
        }
    }

    interface Condition {
        boolean test(Person p);
    }
}