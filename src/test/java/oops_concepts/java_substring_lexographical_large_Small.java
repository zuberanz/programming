package oops_concepts;

import java.util.Scanner;

public class java_substring_lexographical_large_Small {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        java.util.ArrayList<String> substr = new java.util.ArrayList();
        int len = s.length();
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        for (int i = 0; i <= (len-k); i++) {
            substr.add(s.substring(i, (i + k)));
        }

        String[] strArr = substr.toArray(new String[substr.size()]);
        java.util.Arrays.sort(strArr);

        smallest = strArr[0];
        largest = strArr[strArr.length - 1];


        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {

        //welcometojava
        //3
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));

    }

}
