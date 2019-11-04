package string.manipulation;

import java.util.ArrayList;

public class permuationOfString {

    public static void permute(char[] ary, int startIndex, int endIndex) {
        System.out.println("in permute " + String.valueOf(ary)+ ","+ startIndex +","+endIndex);
        if(startIndex == endIndex){
            System.out.println("rerturning " + String.valueOf(ary)+ ","+ startIndex +","+endIndex);

            System.out.println(String.valueOf(ary));
        }else{
            for(int i=startIndex;i<=endIndex;i++) {
                swap(ary, startIndex, i );
                permute(ary, startIndex+1, endIndex);
                swap2(ary, startIndex, i );
            }
        }
    }

    public static void swap(char[] ary, int x, int y) {
        System.out.println("in swap " + String.valueOf(ary)+ ","+ x +","+y);

        char temp = ary[x];
        ary[x] = ary[y];
        ary[y] = temp;
    }

    public static void swap2(char[] ary, int x, int y) {
        System.out.println("in swap2 " + String.valueOf(ary)+ ","+ x +","+y);

        char temp = ary[x];
        ary[x] = ary[y];
        ary[y] = temp;
    }


    public static void main(String[] args){
        String str="ABC";
        permute(str.toCharArray(),0,str.length()-1);
    }


}
