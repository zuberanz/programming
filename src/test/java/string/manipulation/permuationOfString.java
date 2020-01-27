package string.manipulation;

import java.util.ArrayList;

public class permuationOfString {

    public static void str_recursion(String str, int left, int right){
        if(left==right){
            System.out.println(str);
        }else{
            for(int i=left; i <= right ; i++) {
                String swap = swapstr(str, left,i );
                str_recursion(swap,left+1, right);

            }
        }

    }


    public static String swapstr(String str, int i, int j){
        char temp;
        char[] str_arr = str.toCharArray();
        temp = str_arr[i];
        str_arr[i] = str_arr[j];
        str_arr[j] = temp;
        return String.valueOf(str_arr);
    }



    public static void main(String[] args){

        String str = "ABC";
        str_recursion(str, 0, str.length()-1);
    }
}
