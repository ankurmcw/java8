package com.lambda;

/**
 * Created by amarchattiwar on 4/23/17.
 */
public class RunnableLambda {

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Executing thread using Runnable Interface");
            }
        });

        t1.start();

        Thread t2 = new Thread(() -> System.out.println("Executing thread using Lambda"));

        t2.start();

    }
}
