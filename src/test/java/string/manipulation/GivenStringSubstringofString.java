package string.manipulation;

import java.util.Scanner;

public class GivenStringSubstringofString {


    public static  Boolean IsStringASubString(String str1, String str2){

        int len1 = str1.length();
        int len2 = str2.length();
        if(len2>len1){ return false;}
        if(len1==len2){return str1.equals(str2);}

        for(int i=0 ; i < len1-len2+1; i++){

            if(str1.substring(i,i+len2).equals(str2)){
                return true;
            }

        }
        return false;
    }



    public static  int IsStringASubString1(String str1, String str2){
        int len1 = str1.length();
        int len2 = str2.length();
        if(len2>len1){ return -1;}
        if(len1==len2){ return (str1.equals(str2)) ? 0 : -1;}

        for(int i=0; i < len1-len2+1; i++ ){
            int count=0;
            for(int j=i; j < j+len2; j++){
                if(str1.charAt(j) == str2.charAt(j-i)){
                    count++;
                }else{
                    break;
                }
                if(count==len2){
                    return i;
                }
            }
        }
        return -1;
    }


    public static int[] longestCommonPrefix(String pattern){
        int len = pattern.length();
        int lcp[] = new int[len];
        lcp[0]=0;
        int i = 0;
        int j = i+1;

        while(j<len){

            if(pattern.charAt(i) == pattern.charAt(j)){
                lcp[j] = i + 1;
                j++;
                i++;
            }else{
                if(i==0){
                    i=0;
                    j++;
                }else{
                i--;}
            }
        }

        return lcp;
    }


    public static int kmp_implementation(String mainString, String pattern){

        int[] lcp = longestCommonPrefix(pattern);
        int plen = pattern.length();
        int strlen = mainString.length();
        int i=0, j=0;
        while(i<strlen){
            if(mainString.charAt(i) == pattern.charAt(j)){
                i++;
                j++;
            }else{
                if(j==0){
                    i++;
                }else{
                    j = lcp[j-1];
                }
            }
            if(j==plen){
                System.out.println("Found the pattern at the index "+ (i-j));
                return i-j;
            }

        }

        return -1;
    }


    public static void main(String[] arbs){
       /* Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the main string");
        String str1 = sc.next();
        System.out.println("Please enter a string to check if its a substring of the main string provided above");
        String str2 = sc.next();*/

        //System.out.println(str1.substring(4));
        //System.out.println(IsStringASubString(str1,str2));
        //System.out.println(IsStringASubString1(str1,str2));

        //longestCommonPrefix("ABCDABC");
        String str1 = "aaaaaaaaaaaaaaaaaaaaaaaab";
        String str2 = "aaaaaaaaaaaaaaaaaaaaaaaac";
        long start = System.nanoTime();
        System.out.println(IsStringASubString1(str1,str2));
        long end = System.nanoTime();

        System.out.println("time taken by IsStringASubString1 : " + (end- start));

        long start1 = System.nanoTime();
        System.out.println(kmp_implementation(str1,str2));
        long end1 = System.nanoTime();
        System.out.println("time taken by kmp_implementation : "  + (end1- start1));


    }
}
