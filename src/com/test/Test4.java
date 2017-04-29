package com.test;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * Created by amarchattiwar on 8/23/16.
 */
public class Test4
{
    public static void main(String[] args) {
        NullPointerException e = new NullPointerException();
        printStackTrace(e);
    }

    public static void printStackTrace (Exception e)
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        e.printStackTrace(pw);
        System.out.println(sw.toString());
    }
}
