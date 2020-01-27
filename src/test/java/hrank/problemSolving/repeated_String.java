package hrank.problemSolving;

import java.util.Scanner;

public class repeated_String {

    /*

        Lilah has a string, , of lowercase English letters that she repeated infinitely many times.

Given an integer, , find and print the number of letter a's in the first  letters of Lilah's infinite string.

For example, if the string  and , the substring we consider is , the first  characters of her infinite string. There are  occurrences of a in the substring.

Function Description

Complete the repeatedString function in the editor below. It should return an integer representing the number of occurrences of a in the prefix of length  in the infinitely repeating string.

repeatedString has the following parameter(s):

s: a string to repeat
n: the number of characters to consider
Input Format

The first line contains a single string, .
The second line contains an integer, .

Constraints

For  of the test cases, .
Output Format

Print a single integer denoting the number of letter a's in the first  letters of the infinite string created by repeating  infinitely many times.

Sample Input 0

aba
10
Sample Output 0

7
Explanation 0
The first  letters of the infinite string are abaabaabaa. Because there are  a's, we print  on a new line.

Sample Input 1

a
1000000000000
Sample Output 1

1000000000000
Explanation 1
Because all of the first  letters of the infinite string are a, we print  on a new line.



     */





    static long numOfOccurence(String s){

        int len = s.length();
        long ctr=0;
        int[] arr = new int[5];
        for(int i=0; i<len; i++){

            if(s.charAt(i) == 'a'){
                ctr++;
            }
        }

        Scanner scan = new Scanner(System.in);
        return ctr;

    }

    static long repeatedString(String s, long n){

        long len = s.length();
        long char_num = numOfOccurence(s);

        if(!s.contains("a")){
            return 0;
        }
        if(s.equals("a")){
            return n;
        }
        if(n <= len){
            return numOfOccurence(s.substring(0,(int)n));
        }

        long repeatNum = n / len;
        long diff = n - (repeatNum*len);

        return (repeatNum*char_num) + numOfOccurence(s.substring(0,(int)diff));

    }




    public static void main(String[] args){

        /*testcases
        * 1. (aba , 10)
        * 2. (abkhadkhhhdash, 500)
        *
        * */


        long n = 0;
       // n = 736778906400L ;
       /* n = repeatedString("kmretasscityylpdhuwjirnqimlkcgxubxmsxpypgzxtenweirknjtasxtvxemtwxuarabssvqdnktqadhyktagjxoanknhgilnm",
                n);*/

        n = repeatedString("alkdjdasaaaaddsa",
                22);
        System.out.println(n);


    }

}
