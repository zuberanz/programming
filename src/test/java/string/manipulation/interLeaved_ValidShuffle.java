package string.manipulation;

public class interLeaved_ValidShuffle {



    public static Boolean validShuffle(String str1, String str2, String str3){

        int len = str1.length();
        if((str1.charAt(0) != str3.charAt(0) || (str2.charAt(0) != str3.charAt(0)))){
            return false;
        }


        return true;



    }






    public static void main(String[] args){

        System.out.println(validShuffle("","",""));

    }
}
