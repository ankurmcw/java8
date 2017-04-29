package com.lambda;

/**
 * Created by amarchattiwar on 4/26/17.
 */
public class Closures {

    public static void main(String[] args) {
        int a = 10;
        int b = 10; //no need of marking b as final
        process(a, new Process() {
            @Override
            public void process(int i) {
                System.out.println(i + b); // from java 8 we can pass an argument inside an inner class without marking it as final
                // However if we try to change the value of b it will throw an error. example below
                //b = 40;
            }
        });

        process(a, i -> System.out.println(i + b)); // Lambda version of above statement
    }

    public static void process(int i, Process p) {
        p.process(i);
    }
}
