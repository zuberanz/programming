package string.manipulation;

import java.util.ArrayList;
import java.util.HashSet;

public class palindrome_in_a_string {

    public static HashSet<String> pals = new HashSet<>();

    public static void expand(String str,int low, int high){

        int len = str.length();

        while((low>=0 && high < len) && (str.charAt(low) == str.charAt(high))){
            low--;high++;
            if(str.substring(low+1,high).length()>1)
            pals.add(str.substring(low+1,high));
        }
    }

    public static void findPalindrome(String str){

        int len = str.length();
        String evenPal;
        String oddPal;
        for(int i=0; i < len; i++){

           expand(str,i,i);
           expand(str,i,i+1);

        }

        if(pals.size() != 0){
            System.out.println("Found below palindrome(s) in the string "+str);
            System.out.println(pals);
        }else{
            System.out.println("No palindrome(s) Found in the string "+str);
        }
    }





    public static void main(String[] args){
        findPalindrome("zubernargundn");

    }

}
