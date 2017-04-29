package com.lambda;

/**
 * Created by amarchattiwar on 4/26/17.
 */
public class ThisReference {

    public static void main(String[] args) {
        ThisReference thisReference = new ThisReference();
        thisReference.process(10, new Process() {
            @Override
            public void process(int i) {
                System.out.println(i);
                System.out.println(this);
            }

            @Override
            public String toString() {
                return "This is the anonymous inner class implementation of Process Interface";
            }
        });

        thisReference.process(10, i -> {
                System.out.println("Inside lambda: " + i);
                // System.out.println(this);
                // Lambdas are not anonymous inner classes
                // this cannot be accessed inside a lambda from a static context
            }
        );

        thisReference.execute();
    }

    public void process(int i, Process p) {
        p.process(i);
    }

    public void execute() {
        this.process(10, i -> {
            System.out.println(i);
            System.out.println(this);
            // lambda can access the this reference from an instance method
        });
    }

    @Override
    public String toString() {
        return "This is ThisReference class";
    }
}
