package com.test;

import java.io.File;

/**
 * Created by amarchattiwar on 9/19/16.
 */
public class Test7 {

    public static void main(String[] args) {
        File file = new File("/RDNG_VLTPKG1/111111_Guy_Some_Sep-16-2016_16-34PM/Employment Information/PayStubs (2).pdf");
        System.out.println(file.exists());
    }
}
