package com.lambda;

/**
 * Created by amarchattiwar on 4/23/17.
 */
public class FunctionalInterface {

    public static void main(String[] args) {
        GreetingFunctional functional = () -> "Functional interface greetings";
        System.out.println(functional.greet());
    }
}

@java.lang.FunctionalInterface
interface GreetingFunctional {
    String greet();
}
