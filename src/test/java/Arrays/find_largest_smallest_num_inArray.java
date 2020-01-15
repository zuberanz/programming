package Arrays;

import java.util.Arrays;

public class find_largest_smallest_num_inArray {

    public static void find_smallest_largest(int[] arr){
        int small =  arr[0];
        int large = arr[0];

        for(int n : arr){
            if(n > large){
                large = n;
            }else if (n < small){
                small = n;
            }
        }

        System.out.println("Largest : "+large+" , Smallest : "+small);

    }

    public static void main(String[] args){
        int[] arr = new int[]{16,13,26,20,23,54,5,31,12,6,7,8,9,30,10,12,11,11,13,14,15,16,20};
        System.out.println(Arrays.toString(arr));

        find_smallest_largest(arr);

    }
}
