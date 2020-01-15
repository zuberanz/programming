package Arrays;

import java.util.Arrays;

public class find_all_pairs_sum_given_num {

    public static void find_all_pairs_n2(int[] arr, int sum){
        int len = arr.length;

        for(int i=0; i<len; i++){
            int first_num = arr[i];
            for(int j=i+1; j<len; j++){
                int sec_num = arr[j];
                if(first_num+sec_num == sum){
                    System.out.println(first_num+" + " + sec_num +" = "+sum);
                }
            }
        }
    }

    public static void find_allPairs_Onlogn(int[] arr, int sum){
        int len = arr.length;

        Arrays.sort(arr);
        int low=0, high=len-1, tempSum=0;

        while(low<high){
            tempSum = arr[low]+arr[high];
            if(( tempSum == sum)){
                System.out.println(arr[low]+" + " + arr[high] +" = "+tempSum);
                low++;
                high--;
            }else if (tempSum < sum){
                low++;
            }else{
                high--;
            }
        }
    }




    public static void main(String[] args){
        int[] arr = new int[]{6,7,8,9,10,1,3,2,5};
        find_all_pairs_n2(arr,9);
        System.out.println("************************");
        find_allPairs_Onlogn(arr,9);
    }
}
