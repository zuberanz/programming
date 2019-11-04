package number_series;

import java.util.HashMap;
import java.util.Scanner;

public class fibonacci_memoizedHashMap {


    public static HashMap<Integer,Long> fibMap = new HashMap<>();

    public static long fibonacci_print_rec_mmoized_hashmap(int n){


        if(fibMap.containsKey(n)){
            return fibMap.get(n);
        }else{
            fibMap.put(n, (Long)(fibonacci_print_rec_mmoized_hashmap(n-1)+(fibonacci_print_rec_mmoized_hashmap(n-2))));
            return fibMap.get(n);
        }



    }







    public static void main(String[] args){
        fibMap.put(1,new Long(0));
        fibMap.put(2,new Long(1));
        System.out.println("Which position number you want in the fibonacci series");
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        System.out.println("The "+n+"th number is fib series is "+fibonacci_print_rec_mmoized_hashmap(n));

    }
}
