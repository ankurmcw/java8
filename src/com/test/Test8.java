package com.test;

import java.util.*;

/**
 * Created by amarchattiwar on 4/12/17.
 */
public class Test8 {

    public static void main(String[] args) {
        Date date1 = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(date1);
        c.set(Calendar.MINUTE, c.get(Calendar.MINUTE) + 1);
        Date date2 = c.getTime();

        List<PackageDocument> documentList = new ArrayList<>();
        documentList.add(new PackageDocument("DOCID-4", 2, 1491898433000L));
        documentList.add(new PackageDocument("DOCID-3", 2, 1491997347000L));
        documentList.add(new PackageDocument("DOCID-2", 1, 1492063972000L));


        Collections.sort(documentList);

        System.out.println(documentList);
    }
}
