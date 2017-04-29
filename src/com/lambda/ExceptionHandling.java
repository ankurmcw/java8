package com.lambda;

import java.util.function.BiConsumer;

/**
 * Created by amarchattiwar on 4/23/17.
 */
public class ExceptionHandling {

    public static void main(String[] args) {
        int [] someNumbers = {1, 2, 3, 4};

        int key = 0;

        process(someNumbers, key, lambdaWrapper((v, k) -> System.out.println(v/k)));
    }

    private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> consumer) {
        for (int number: someNumbers) {
            consumer.accept(number, key);
        }
    }

    private static BiConsumer<Integer, Integer> lambdaWrapper(BiConsumer<Integer, Integer> consumer) {
        return (v, k) -> {
            try {
                consumer.accept(v, k);
            } catch (Exception e) {
                System.out.println("Exception caught inside wrapper lambda");
            }
        };
    }

}
