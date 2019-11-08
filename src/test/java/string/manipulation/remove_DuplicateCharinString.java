package string.manipulation;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class remove_DuplicateCharinString {

    public static String remove_dupcharrs(String str){
        LinkedHashSet<Character> charset = new LinkedHashSet<>();
        char[] strchar = str.toCharArray();
        String res="";
        for(char c : strchar){
            if(charset.add(c)){
                res = res+ c;
            }
        }
        return res;
    }




    public  static void main(String[] args){

        String str= "Hammaad";
        System.out.println(remove_dupcharrs(str));


    }
}
