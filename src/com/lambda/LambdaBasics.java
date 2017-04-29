package com.lambda;

/**
 * Created by amarchattiwar on 4/22/17.
 */
public class LambdaBasics {

    void action(Greeting greeting) {
        greeting.perform();;
    }

    public static void main(String[] args) {
        LambdaBasics ex = new LambdaBasics();

        Greeting anonymousGreeting = new Greeting() {
            @Override
            public void perform() {
                System.out.println("Hello from anonymous inner class");
            }
        };

        ex.action(anonymousGreeting);

        Greeting lambdaGreeting = () -> System.out.println("Hello from lambda expression");

        ex.action(lambdaGreeting);

    }

    interface Greeting {
        void perform();
    }
}

