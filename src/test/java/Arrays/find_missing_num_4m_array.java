package Arrays;

import java.util.Arrays;
import java.util.BitSet;
import java.util.Scanner;

public class find_missing_num_4m_array {

    public static int find_missing_num(int[] n,int num){

        int sum = (num * (num + 1)) / 2;
        int sum_of_arr_elements=0;
        int len = n.length;

        while(len>0){
            sum_of_arr_elements = sum_of_arr_elements + n[len-1];
            len--;
        }
        return (sum-sum_of_arr_elements);
    }

    private static void printMissingNumber_BitSet(int[] numbers, int count) {
       int missingCount = count - numbers.length;
       BitSet bs = new BitSet(count);
       for(int nums : numbers){
           bs.set(nums-1);
       }

        int res=0;
        int missingIndex=0;
        System.out.println("missing number are");
        for(int i=0; i<missingCount ; i++){
            missingIndex = bs.nextClearBit(missingIndex);
            System.out.println(++missingIndex);
        }



    }


    public static void main(String[] arr){
        int[] n = new int[] {1,2,3,5,6,7,8,9,10,11,12};
        System.out.println(find_missing_num(n,12));

        int[] n1 = new int[] {3,5,6,7,10,12};
        printMissingNumber_BitSet(n1,12);
    }
}
