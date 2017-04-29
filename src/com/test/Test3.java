package com.test;

import java.util.Scanner;

/**
 * Created by amarchattiwar on 8/12/16.
 */


/*
Sample Input

2
9 4 5
aabaacaba
9 8 9
bacbacacb

Sample Output
26
42

Test Input
3
50 1 3
caacctinbnatinbnaqaacctinbnatinbnainbnatigaeifcaac
50 2 4
bbaakbbabaptakbbabaptafbbabbaakbbabapcqkmbbabaptak
50 2 2
cbbcnkbbcbnkbbcbtnkatnbebgcbnkbgbcnkbbcbnkmbndnknk
Test Output
29
50
50

Test Input
3
1500 8368 8371
abcabcajapkcdabcalajapkcdabckdabccojerbcajapkcdabcalatrhajapkcdabcalajapkcdabckdabccojerbcajapkcdabcojerbcajapkcdabcalatrhajapkcdabcalajapkcdabckdabccojerbajapkcdabckdabccojerbcajapkcdabcalatrhajapkcdabcalajapkcdabckdabccojerbcajapkgpkcdabckdabccojasaajapkcdabcalajapkcdabckdabccojerbcajapkcdabcalatrhajapkcdabcalajapkcdabckdabccojerbcajapkcdabcojerbcajapkcdabcalatrhajapkcdabcalajapkcdabckdabccojerbajapkcdabckdabccojerbcajapkcdabcalatrhajapkcdabcalajapkcdabckdabccojerbcajapkgpkcdabckdabccojkckcdabckdabccojerbcajapkcdabcojerbcajapkcdabcalatrhajapkcdabcalajapkcdabckdabccojerbajapkcdabckdabccojccojasaajapkcdabcalajapkcdabckdabccojerbcajapkcdabcalatrhajapkcdabcalajapkcdabckdabccojerbcajapkcdabcojerbcajapkcdabcalatrhajapkcdabcalajapkcdabckdabccojerbajapkcdabckdabccojerbcajapkcdabcalatrhajapkcdabcalajapkcdabckdabccojerbcajapakeoccojerbcajapkcdabcojerbcajapkcdabcalatrhajapkcdabcalajapkcdabckdabccojerbajapkcdabckdabccojerbcajapkcdabcalpkcdabckdabccojerbcajapkcdabcalatrhajapkcdabcalajapfjacabcalatrhajapkcdabcalajapkcdabckdabccojerbcajapkgpkcdabckdabccojasaajapkcdabcalajapkcdabckdabccojerbcajapkcdabcalatrhajapkcdabcalajapkcdabckdabccojerbcajapkcdabcojerbcajapkcdabcalatrhajapkcdabcalajapkcdabckdabccojerbajapkcdabckdabccojerbcajapkcdabcalatrhajapkcdabcalajapkcdabckdabccojerbcajapkgpkcdabckdabccojkckcdabckdabccojerbcajapkcdabcojerbcajapkcdabcalatrhajapkcdabcalajapkcdabckdabccojerbajapkcdabckdabccojccojasaajapjpdacabcabckdabccojerbajapkcdabckdabccojccojasaajapkcdabcalajapkcdabckdsmapkcdabsab
1500 7233 7234
bccadbccagfdmpbccadbccagfmcsdfcidmpbccadbccagfmcsdfcgfmcsdfcidmpbccaigpmadbccagfdmpbccadbccagfmcsdfcidmpbccadbccagfmcsdfcgfmcsdfcidmpbccaigbccadbccagfdmpbccadbccagfmcsdfcidmpbccadbccagfmcsdfcgfmcsdfcidmpbccaigpmadbccagfdmpbccadbccagfmcsdfcidmpbccadbccagfmcsdfcgfmcsdfcidmpbcctbccadbccagfdmpbccadbccagfmcsdfcidmpbccadbccagfmcsdfcgfmcsdfcidmpbccaigpmadbccagfdmpbccadbccagfmcsdfcidmpbccadbccagfmcsdfcgfmcsdfcidmpbccaigbccadbccagfdmpbccadbccagfmcsdfcidmpbccadbccagfmcsdfcgfmcsdfcidmpbccaigpmadbccagfdmpbccadbccagfmcsdfcidmpbccadbccagfmcsdfcgfmcsdfcabbrngbgbccadbccagfdmpbccadbccagfmcsdfcidmpbccadbccagfmcsdfcgfmcsdfcidmpbccaigpmadbccagfdmpbccadbccagfmcsdfcidmpbccadbccagfmcsdfcgfmcsdfcidmpbcctbccadbccagfdmpbccadbccagfmcsdfcidmpbccadbccagfmcsdfcgfmcsdfcidmpbccaigpmadbccagfdmpbccadbccagfmcsdfcidmpbccadbccagfmcsdfcgfmcsdfcidmpbccaigbccadbccagfdmpbccadbccagfmcsdfcidmpbccadbccagfmcsdfcgfmcsdfcidmpbccaigpmadbccagfdmpbccadbccagfmcsdfcidmpbccadbccagfmcsdfcgfmcsomcsdfcidmpbccaigpmadbccagfdmpbccadbccagfmcsdfcidmpbccadbccagfmcsdfcgfmcsdfcidmpbccaigbccadbccagfdmpbccadbccagfmcsdfcidmpbccadbccagfmcsdfcgfmcsdfcidmpbccaigpmadbccagfdmpbccadbccagfmcsdfcidmpbccadbccagfmcsdfcgfmcsdfcidmpbcctbccadbccagfdmpbccadbccagfmcsdfcidmpbccadbccagfmcsdfcgfmcsdfcidmpbccaigpmadbccagfdmpbccadbccagfmcsdfcidmpbccadbccagfmcsdfcgfmcsdfcidmpbccaigbccadbccagfdmpbccadbccagfmcsdfcidmpbccadbccagfmcsdfcgfmcsdfcidmpbccaicsdfcidmpbccadbccagfmcsdfcgfmcsdfcidmpbccaigpmadbccagfdmpbccadbccagfmcsdfcidmpbccccagkcgfmcsdfcidmpbccaigpmahmfdhdc
1500 636 641
baccbacaccbbaccbacccbacabaccqcbrqcacdnpsqcacdnpsccacdnpsccacdbrqcacdnbrqcacdeeahfrqcacgbbprqcbrqcacqqidnjrqcacdnedcbrqcbklrqcbrqqcacdnacdbrqrjmjklrrcacdnpsqcanoqidnjrqcacbkjmaccbagtdarqcacbkjbcacqcapgjoqrjmjklrdnedcbdnpsqcaoidnjrqdnpspmpodjrqcacbhrqcabdnacdiaccqcbkbspmpodjbsfemmcacccgdcbrqcbkliqcacqqishenhodjrqcacbhmpjgfemgpdkliqcacqqirspmpodjbeacgbbprqcbrndhaccbagtdrqdatmcacccarqcacbkdsmrimjqcapgjoqrjtccgdcbrigdcbrqcbkrjmjklraccbacgdcbrqcbkjfcacgaillmcbagtdacrjtccgajacdetdaracrjtccgaillmcbaagpsccacdbrblbthaccbagtdoijtdacbkjfsonrtnraccbanirbkstttjjdgtdacbkjfspmricnjdentgfnrpimkjmokkjbgnpsqpesntgfnrpimcacdbrblbtjntgfnrprqcbkrjmjkkstttjjdgteojbrndrgajntdrqdodablbthaccgidlrqqcacdnarkkipsccacdbrqpjfcacraccbqcbkliqckrejsajkmgsbeacgbbpqhijpmpodjrqcadsqpsccacdbracshrqnpsqcankenpodjrqcaqddmcbagtdsfjkenpoacdetgfnrpimcasmbtdjmcacpsqpesntgsqpesntgfnprqcfrpisntgfnprqdgtdcbbaccbhqppofondrgacbaccoqgacbrdhaccaobamcacqqishiaccqrqcbkllfbsonrtnracqnginleilrgacbacccbkjfspmriftgfnrpimfcacgaillmmpcacgaillmmaccbacgdctacdnacdbrqromsqpesntgfncbrqcbkjgiqqirspmpodsmiijpmpgrqcbklrehpthoqrqcbpodsctgajkmgsbeaqcbklicbbacccbkbbpbbfbrqcbkjgdbrqcbkjdrrkkipsdliqcqctdrqdbnrtcbasttqjdgfnrpimgmbadpdqodpqhbaccoqdtgfsnqcbkllfbsoeskeqjdgfnrpimfsnqcbkllbcacqcpqlrrdspeqcahaccbatdjmcachcdcbklrehptgsdoijtkdabdnqishiahaccighleblcaqfhjjrcdbrqrofqishiafidnjrqcatgfncbjrcbqcacbhmhanacdbrqqccacbhmpjhggtmcacccdgfbsonrsldcbrqhqcbrndpkrbsopdqodpqhbacbacsqqirspmpodamsbeaqcbklftadctaoqgacbrdhactpcsqqirspcbbacccbklkcshrtdksqqirspe

Test Output
477039
347198
291276

Test Input
3
10 2 3
caaahqcqes
10 1 3
acbbqbbqbb
10 2 4
cbabecbahe

Test Output
20
10
18

Test Input
3
40 1 2
cbaasgcbiikaegcbiidcbaasgcbiikaegcbiidir
40 1 3
cabcjpsdaedsasedsascabcjpsddsdaedsasedsa
40 2 3
cbacojcrojcrlidickjcjcrojcrlijcrojcrrojq
Test Output
20
24
45
*/


public class Test3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int noOfTestCase = s.nextInt();
        for(int i=0; i<noOfTestCase; i++) {
            int length = s.nextInt();
            int appendCost = s.nextInt();
            int copyCost = s.nextInt();
            String source = s.next();
            System.out.println(totalCost(length, appendCost, copyCost, source));
        }
    }

    private static int totalCost(int length, int appendCost, int copyCost, String source) {
        int totalCost = 0;
        if(length == 0) {
            totalCost = 0;
        } else if (length == 1) {
            totalCost = appendCost;
        } else if (length == 2) {
            totalCost = appendCost * 2;
        } else if (length == 3) {
            totalCost = appendCost * 3;
        } else {
            totalCost = appendCost * 2;
            String target = source.substring(0, 2);
            System.out.println("Target string: " + target);
            while(target.length() != length) {
                int startIndex = target.length();
                int endIndex = startIndex * 2;
                if(endIndex > length) {
                    endIndex = length;
                }
                String subStr = source.substring(startIndex, endIndex);
                boolean status = true;
                while(subStr.length() >= 2) {
                    System.out.println("StartIndex: " + startIndex + ", EndIndex: " + endIndex + ", SubString: " + subStr);
                    if(target.contains(subStr)) {
                        System.out.println("Substring exists");
                        target += subStr;
                        if((subStr.length() * appendCost) < copyCost) {
                            totalCost += (subStr.length() * appendCost);
                            System.out.println("Total cost after appending " + subStr + ": "+ totalCost);
                        } else {
                            totalCost += copyCost;
                            System.out.println("Total cost after copying " + subStr + ": "+ totalCost);
                        }
                        status = false;
                        break;
                    }
                    endIndex --;
                    subStr = source.substring(startIndex, endIndex);
                }
                if(status) {
                    subStr = source.substring(startIndex, startIndex + 1);
                    target += subStr;
                    totalCost += appendCost;
                    System.out.println("Total cost after appending " + subStr + ": "+ totalCost);
                }
                System.out.println("Target string: " + target);
            }
            System.out.println("Target string: " + target);
        }

        return totalCost;
    }
}
