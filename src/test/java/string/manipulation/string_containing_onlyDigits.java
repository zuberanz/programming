package string.manipulation;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Scanner;
import java.util.regex.Pattern;

public class string_containing_onlyDigits {



    public static Boolean check_string_hasOnly_Digits(String str){

        if(str.length() == 0){
            return false;
        }

        str=str.replaceAll("[0-9]","");
        if(str.length() !=0){
            return false;
        }

        return true;

    }

    public static Boolean check_ifonlyDigits_Using_Pattern(String str){

        Pattern onlyDig = Pattern.compile(".*[0-9].*");

        Pattern onlyChar = Pattern.compile(".*\\D.*");

        Pattern sixDigits = Pattern.compile(".*\\d{6}.*");


        return onlyDig.matcher(str).matches();

    }



    public static void main(String[] args){

        System.out.println("Enter a string to check if it has only digits");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(check_string_hasOnly_Digits(str));
        System.out.println(check_ifonlyDigits_Using_Pattern(str));



    }
}
