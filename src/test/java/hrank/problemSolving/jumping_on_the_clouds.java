package hrank.problemSolving;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class jumping_on_the_clouds {

    /* ---------------------------- PROBLEM DEFINITION -----------------------------------

    Emma is playing a new mobile game that starts with consecutively numbered clouds. Some of the clouds are thunderheads and others
    are cumulus. She can jump on any cumulus cloud having a number that is equal to the number of the current cloud plus  or . She must
     avoid the thunderheads. Determine the minimum number of jumps it will take Emma to jump from her starting postion to the last cloud. It is always possible to win the game.
    For each game, Emma will get an array of clouds numbered  if they are safe or  if they must be avoided.
    For example,  indexed from . The number on each cloud is its index in the list so she must avoid the clouds at indexes  and .
    She could follow the following two paths:  or . The first path takes jumps while the second takes .

    Function Description

    Complete the jumpingOnClouds function in the editor below. It should return the minimum number of jumps required, as an integer.
    jumpingOnClouds has the following parameter(s):
    c: an array of binary integers
    Input Format
    The first line contains an integer , the total number of clouds. The second line contains n space-separated binary integers
    describing clouds

    Output Format

    Print the minimum number of jumps needed to win the game.

    Sample Input 0

    7
    0 0 1 0 0 1 0
    Sample Output 0

    4
    Explanation 0:
    Emma must avoid  and . She can win the game with a minimum of 4 jumps:

     */



    // Complete the jumpingOnClouds function below.
    /* this the original solution written : Thought process : to always jump 2 indexes if only the clouds are cumulus ie(array value 0)
    or else just jump one position.
    IMPORTANT : starting a jump from -1 postion //since indexing starting at 0
    * */

    static int jumpingOnClouds(int[] c) {
        int jump=0;
        for(int i =0 ; i < c.length-1;i++,jump++ ){

            if(i < (c.length -2) && c[i+2] == 0){
                i++;
            }
        }
        System.out.println("original Solution : Least no of jumps : "+ jump);
        return jump;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c);

        scanner.close();
    }

}
