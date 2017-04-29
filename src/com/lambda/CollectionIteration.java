package com.lambda;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

/**
 * Created by amarchattiwar on 4/26/17.
 */
public class CollectionIteration {

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

        // These are external loops and they are executed sequentially
        long l = Calendar.getInstance().getTimeInMillis();
        System.out.println("Iterating using for loop");
        for (int i=0; i< people.size(); i++) {
            System.out.println(people.get(i));
        }
        System.out.println(Calendar.getInstance().getTimeInMillis() - l);

        System.out.println();

        long m = Calendar.getInstance().getTimeInMillis();
        // These are external loops and they are executed sequentially
        System.out.println("Iterating using enhanced for loop");
        for (Person p: people) {
            System.out.println(p);
        }
        System.out.println(Calendar.getInstance().getTimeInMillis() - m);

        System.out.println();

        long n = Calendar.getInstance().getTimeInMillis();
        // These are internal loops and they are executed in parallel by the run time. It is useful when there are multiple cores
        System.out.println("Iterating using for each loop");
        people.forEach(p -> System.out.println(p));
        System.out.println(Calendar.getInstance().getTimeInMillis() - n);

        System.out.println();

        long o = Calendar.getInstance().getTimeInMillis();
        // These are internal loops and they are executed in parallel by the run time. It is useful when there are multiple cores
        System.out.println("Iterating using for each loop with method reference");
        people.forEach(System.out::println);
        System.out.println(Calendar.getInstance().getTimeInMillis() - o);
    }
}
