package string.manipulation;

import java.util.ArrayList;
import java.util.Arrays;

public class string_countVowelsConsonants {

    public static void print_num_consonants_vowels(String str){

        str = str.replaceAll("[0-9]","");
        ArrayList<Character> vowelsList =  new ArrayList<Character>(Arrays.asList('a','e','i','o','u'));
        int vowel=0;
        for(char c : str.toCharArray()){
            if(vowelsList.contains(c)){
                vowel++;
            }
        }

        System.out.println(" number of vowels :"+ vowel + "consonants :" + (str.length()-vowel));


    }



    public static void main(String[] args){

        print_num_consonants_vowels("how many vowels in this string12");

    }
}
