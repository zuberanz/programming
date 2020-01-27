package string.manipulation;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class work_rough {


        // Complete the repeatedString function below.
        static int NoOfOcuurence(String s){
            int ctr=0;
            for(int i=0; i < s.length() ; i++){
                if(s.charAt(i) == 'a'){
                    ctr++;
                }
            }
            return ctr;
        }
        static long repeatedString(String s, long n) {

            int len = s.length();
            int substrlen =0;
            long ctr=NoOfOcuurence(s);

            if(s.equals("a")){
                return n;
            }
            if(! s.contains("a")){
                return 0;
            }


            if(n <= len){
                return NoOfOcuurence(s.substring(0,(int)n));
            }else{
                long repeatStrnum = n/s.length();
                int diff = (int) (n - (repeatStrnum* s.length()));
                return (ctr*repeatStrnum) + NoOfOcuurence(s.substring(0,diff));

            }


        }

    public static void main(String[] args){

            long  n = 736778906400L ;
        repeatedString("kmretasscityylpdhuwjirnqimlkcgxubxmsxpypgzxtenweirknjtasxtvxemtwxuarabssvqdnktqadhyktagjxoanknhgilnm",
                n);


    }
}
