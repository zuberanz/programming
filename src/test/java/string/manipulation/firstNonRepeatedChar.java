package string.manipulation;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class firstNonRepeatedChar {

    public static void printFirstNonReptdChar_LinkedHashMap(String str){

        str = str.toLowerCase();
        char[] arr = str.toCharArray();
        HashMap<Character, Integer> myMap = new LinkedHashMap<>();

        for(char c : arr){

            if(!myMap.containsKey(c)){
                myMap.put(c,1);
            }else {
                myMap.put(c, myMap.get(c) + 1);
            }
        }
        for(Map.Entry<Character,Integer> m : myMap.entrySet()) {
            if (m.getValue() == 1) {
                System.out.println(" The First Non repeated character is :  " + m.getKey());
                break;
            }
        }
    }


    public static void  main(String[] args){

        printFirstNonReptdChar_LinkedHashMap("simplest");

    }

}
