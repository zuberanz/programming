package string.manipulation;

public class string_reverse_recursion {


    public static void String_Rev_Recursion(String str){

        if(str.length() == 0){
            return;
        }

        String_Rev_Recursion(str.substring(1));
        System.out.print(str.charAt(0));
    }


    public static void main(String[] args){
        String str = "My Name is Khan";


        String_Rev_Recursion(str);


    }


}
