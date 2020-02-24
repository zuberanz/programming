package hrank.problemSolving;

import java.util.HashSet;

public class number_sqares_till_sum_is1 {


    public static boolean check_if_square_sum_is_1(int num) {
        HashSet<Integer> seq = new HashSet<>();
        int digit, sum = 0;

        while (true) {
            sum=0;
            while ( num!=0) {
                digit = num % 10;
                sum = sum + (int) Math.pow(digit, 2);
                num=num/10;
            }
            num = sum;
            System.out.println(num +" ");
            if (sum == 1) {
                return true;

            }
            if (!seq.contains(sum)) {
                seq.add(sum);
            } else{
                return false;
            }

        }

    }


    public static void main(String[] args){

        int num = 79;
        System.out.println(check_if_square_sum_is_1(num));







    }
}
