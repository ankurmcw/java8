package com.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Created by amarchattiwar on 4/26/17.
 */
public class MethodReference2 {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Ankur", "Marchattiwar", 30),
                new Person("Renuka", "Mehta", 30)
        );

        System.out.println("Using lambdas");
        processConditionally(people, p -> p.getLastName().startsWith("M"), p -> System.out.println(p));

        System.out.println();
        System.out.println("Using method reference");
        processConditionally(people, p -> p.getFirstName().startsWith("A"), System.out::println);

    }

    public static void processConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
        for (Person p: people) {
            if (predicate.test(p)) {
                consumer.accept(p);
            }
        }
    }
}
