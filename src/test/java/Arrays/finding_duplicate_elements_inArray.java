package Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class finding_duplicate_elements_inArray {



    public static void print_duplicate_Elements(int[] arr){

        int len = arr.length;
        HashSet<Integer> intHashSet = new HashSet<>();
        for(int n : arr){
            if(! intHashSet.add(n)){
                System.out.println(n);
            }
        }
    }



    public static void main(String[] args){

        int[] arr = new int[]{16,1,2,20,3,4,5,1,2,6,7,8,9,0,10,12,11,11,13,14,15,16,20};
        System.out.println(Arrays.toString(arr));
        System.out.println("Below are the duplicate elements in the array");
        print_duplicate_Elements(arr);

    }
}
