package com.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.BitSet;

/**
 * Created by amarchattiwar on 7/26/16.
 */
public class Test1 {

    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        FileReader fr = new FileReader("/home/amarchattiwar/Desktop/vault/input.txt");
        BufferedReader br = new BufferedReader(fr);
        String line = null;
        BitSet set = new BitSet();
        while((line = br.readLine()) != null) {
            set.set(new Integer(line), true);
        }
        System.out.println(set);
        br.close();
        fr.close();
        System.out.println("Total time: " + (System.currentTimeMillis() - start));
        System.out.println(Integer.MAX_VALUE + " : " + Integer.MAX_VALUE/8);
    }
}
