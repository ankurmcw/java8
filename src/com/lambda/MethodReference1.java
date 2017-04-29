package com.lambda;

/**
 * Created by amarchattiwar on 4/26/17.
 */
public class MethodReference1 {

    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                printMessage();
            }
        });
        t1.start();

        Thread t2 = new Thread(() -> printMessage());
        t2.start();

        Thread t3 = new Thread(MethodReference1::printMessage);
        t3.start();
    }

    private static void printMessage() {
        System.out.println("Hello World");
    }
}
