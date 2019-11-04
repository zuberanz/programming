package number_series;

import java.util.Scanner;

public class fibonacci_Print_SeriesTill_number {


    public static void  print_fib_num_Series(int n){

        int i = 1;
        int a = 0, b = 1,c;
        System.out.print("0 1 ");
        while(i <= (n-2)){

            c = a + b;
            a = b;
            b = c;
            System.out.print(c+" ");
            i++;
        }



    }

    public static void main(String[] args){
        System.out.println(" Enter a number upto which fibonacci series to be printed");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(" First "+n+" numbers in a fibonacci series");
        print_fib_num_Series(n);
    }

}
