package com.lambda;

/**
 * Created by amarchattiwar on 4/22/17.
 */
public class TypeInferenceLambda {

    public static void main(String[] args) {
        printLambda(s -> s.length(), "Hello lambda");
    }

    public static void printLambda(Greeting greeting, String s) {
        System.out.println(greeting.getLength(s));
    }

    interface Greeting {
        int getLength(String s);
    }
}
