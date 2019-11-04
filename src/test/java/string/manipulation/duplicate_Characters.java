package string.manipulation;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class duplicate_Characters {



    public static void print_Dup_Char_HashMap(String args){

        System.out.println("Duplicate characters are : ");
        args = args.toLowerCase();
        char[] chars = args.toCharArray();
        Map<Character, Integer> dupchar = new TreeMap();

        for(char c : chars){

            if( ! dupchar.containsKey(c)){
                dupchar.put(c, 1);
            }else{
                dupchar.put(c, (dupchar.get(c))+1);
            }
        }
        for (Map.Entry<Character, Integer> map : dupchar.entrySet()){

            if(map.getValue() > 1){
                System.out.print(" "+map.getKey());
            }
        }
    }



    public static void dup_Chars_with_computeMethod(String str){

                   System.out.println();
        str = str.toLowerCase();

        Map<Character,Integer> dupChar = new TreeMap<>();
        char[] charArr = str.toCharArray();
        for(char c : charArr){
            dupChar.compute(c, (key , val) -> (val == null) ? 1 :  val+1);
        }

        for(Map.Entry<Character, Integer> m : dupChar.entrySet()){
            if(m.getValue() > 1){
                System.out.print(" "+m.getKey());
            }

        }

    }



    public static void main(String[] args){


        print_Dup_Char_HashMap("zzbBoaottttnananO ddff2233");
        dup_Chars_with_computeMethod("zzbBoaottttnananO ddff2233");



    }
}
