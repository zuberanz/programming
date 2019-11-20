package string.manipulation;

import java.lang.reflect.Array;
import java.util.Arrays;

public class interLeaved_ValidShuffle {



    public static Boolean validShuffle(String str1, String str2, String str3){

      int len1 = str1.length();
      int len2 = str2.length();
      int len3 = str3.length();
      int i=0,j=0,k=0;
      if((len1+len2) != len3){
          return false;
      }
      char[] arr1 = (str1+str2).toCharArray();
      char[] arr2 = str3.toCharArray();
      Arrays.sort(arr1);
      Arrays.sort(arr2);

      if(! Arrays.equals(arr1,arr2))  {
          return false;
      }


      while(k < len3){

          if((i < len1) && (str1.charAt(i) == str3.charAt(k))){
              i++;

          }else if((j < len2) && (str2.charAt(j) == str3.charAt(k))){
              j++;

          }else{
              return false;
          }
          k++;
      }

    return true;

    }






    public static void main(String[] args){

        System.out.println(validShuffle("deer","stag","dsteearg"));

    }
}
