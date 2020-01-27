package number_series;

import java.util.Scanner;

public class fibonacci_Series {


    public static long fibonacci_recursion(int n){

        if(n == 0 || n == 1){
            return n;
        }

        return  fibonacci_recursion(n-1)+ fibonacci_recursion(n-2);

    }

    public static long[] fn;

    public static long fibonacci_recursion_memoized(int n){

        if(fn == null){
            fn = new long[n+1];
        }

        if(n == 0 || n ==1){
            fn[n]=n;
            return fn[n];
        }else if(fn[n] != 0){
            return fn[n];
        }

        fn[n] = fibonacci_recursion_memoized(n-1)+ fibonacci_recursion_memoized(n-2);
        return fn[n];

    }

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){

       System.out.println(" Enter the position for which u need the fibonacci value");
        int n  =sc.nextInt();


        long sysStarttime = System.currentTimeMillis();
        System.out.println(fibonacci_recursion(n));
        long sysEndTime = System.currentTimeMillis();
        long totaltime = (sysEndTime - sysStarttime) / 1000 ;
        System.out.println("The time taken in secs" + totaltime );

        System.out.println(" Enter the position for which u need the fibonacci value- memoized solution");

       n  =sc.nextInt();
         long sysStarttime1 = System.currentTimeMillis();
        System.out.println(fibonacci_recursion_memoized(n));
         long sysEndTime1 = System.currentTimeMillis();
         long totaltime1 = (sysEndTime1 - sysStarttime1) / 1000 ;
        System.out.println("The time taken in secs memoized" + totaltime1 );
        System.out.println();
        /*for(long p : fn){
        System.out.print(p + " ");}*/




    }


}
