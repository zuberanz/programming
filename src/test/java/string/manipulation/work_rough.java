package string.manipulation;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class work_rough {

    public static String reverse_stringBuffer(String str){
        StringBuffer sb = new StringBuffer();
        int len = str.length();

        for(int i=len-1; i>=0; i--){
            sb.append(str.charAt(i));
        }

        return sb.toString();

    }

    public static String reverse_r(String str){
        StringBuffer sb = new StringBuffer();
        int len = str.length();
        HashMap<Character,Integer> sp_char = new HashMap<>();

        for(int i=len-1; i>=0; i--){
            Character c = str.charAt(i);
            if(! Character.isLetterOrDigit(c)){
                sp_char.put(c,i);
            }
            else{
            sb.append(str.charAt(i));}
        }

        for(Map.Entry<Character,Integer> m : sp_char.entrySet()){
            sb.insert(m.getValue(), m.getKey().toString());
        }

        return sb.toString();

    }
    /* Driver program to test above function */
    public static void main(String[] args) {

        String Str = "Rev@ersi$ng";

        System.out.println(reverse_r(Str));
    }
}