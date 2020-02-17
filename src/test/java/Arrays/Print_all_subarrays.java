package Arrays;

import java.util.Scanner;

public class Print_all_subarrays {


    public static void print_all_subarrays(int[] arr){

        int len = arr.length;

        for(int s = 0 ; s<len ; s++){

            for(int e=s ;e<=len; e++){

                for(int p = s; p<e ;p++){
                    System.out.print(arr[p]+ " ");
                }
                System.out.println();
            }

        }




    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        String[] sarr ;
        for(int i=0; i<n ; i++){



        }


        print_all_subarrays(arr);


    }
}
