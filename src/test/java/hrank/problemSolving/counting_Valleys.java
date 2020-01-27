package hrank.problemSolving;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class counting_Valleys {

    /*  **************************  PROBLEM STATEMENT *******************************
    Gary is an avid hiker. He tracks his hikes meticulously, paying close attention to small details like topography. During his last hike he took exactly  steps. For every step he took, he noted if it was an uphill, , or a downhill,  step. Gary's hikes start and end at sea level and each step up or down represents a  unit change in altitude. We define the following terms:

A mountain is a sequence of consecutive steps above sea level, starting with a step up from sea level and ending with a step down to sea level.
A valley is a sequence of consecutive steps below sea level, starting with a step down from sea level and ending with a step up to sea level.
Given Gary's sequence of up and down steps during his last hike, find and print the number of valleys he walked through.

For example, if Gary's path is , he first enters a valley  units deep. Then he climbs out an up onto a mountain  units high. Finally, he returns to sea level and ends his hike.

Function Description

Complete the countingValleys function in the editor below. It must return an integer that denotes the number of valleys Gary traversed.

countingValleys has the following parameter(s):

n: the number of steps Gary takes
s: a string describing his path
Input Format

The first line contains an integer , the number of steps in Gary's hike.
The second line contains a single string , of  characters that describe his path.

Constraints

Output Format

Print a single integer that denotes the number of valleys Gary walked through during his hike.

Sample Input

8
UDDDUDUU
Sample Output

1
Explanation

If we represent _ as sea level, a step up as /, and a step down as \, Gary's hike can be drawn as:

_/\      _
   \    /
    \/\/
He enters and leaves one valley.
    * */

    // Complete the countingValleys function below.
    /* My original solution, thought process was to think that if gary has entered the valley and thereafter keep checking
    * if Gary has reached to sea level and this completes one valley
    *   */
    static int countingValleys_myOriginalSolution(int n, String s) {

        int down_ctr=0, valley=0;
        char[] steps = s.toCharArray();
        int valley_entered=0,num_of_valleys=0;
        for(int i=0 ;i < steps.length ; i++){


            if(steps[i] == 'D' ){
                if(--down_ctr < 0){
                    valley_entered=1;
                }
            }else{
                down_ctr++;
                if(valley_entered==1 && down_ctr==0){
                    num_of_valleys++;
                }
            }
            if(down_ctr<0){
                valley_entered=1;
            }


        }

        System.out.println("Solution1 : num of valleys : "+num_of_valleys);
        return num_of_valleys;


    }

    /*
    * Found some smart or slick solutions by other submitters
    * though process : We only care about the number of valleys... So just figure out the number of times you came
    * back up to sea level.
    * This process really simplifies the problem solving process
    * */

    static int countingValleys_slickSolution(int n, String s) {

        int level = 0;
        int count = 0;

        char[] steps = s.toCharArray();
        for (int i = 0; i < steps.length; i++) {

            if (steps[i] == 'U') {
                if (++level == 0) {
                    count++;
                }
            } else {
                level--;
            }
        }
        System.out.println("Solution1 : num of valleys : "+count);
        return count;
    }


    public static void main(String[] args) {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

       /* Sample Input

        8
        UDDDUDUU

        */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys_myOriginalSolution(n, s);
        result = countingValleys_slickSolution(n, s);




        scanner.close();
    }

}
