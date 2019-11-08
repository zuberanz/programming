package string.manipulation;

public class string_Reverse_manyLogics {


    public static String reverse_stringBuffer(String str){
        StringBuffer sb = new StringBuffer();
        int len = str.length();

        for(int i=len-1; i>=0; i--){
            sb.append(str.charAt(i));
        }

        return sb.toString();

    }


    public static String reverse_StringBuffer_inbuitReverse(String str){

        return new StringBuffer(str).reverse().toString();
    }


    public static void main (String[] args){

        String Str = "Reversing a string";

        System.out.println(reverse_stringBuffer(Str));
        System.out.println(reverse_StringBuffer_inbuitReverse(Str));



    }
}
