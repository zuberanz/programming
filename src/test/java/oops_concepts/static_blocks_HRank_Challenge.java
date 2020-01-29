package oops_concepts;

import java.util.Scanner;

public class static_blocks_HRank_Challenge {
    static int B;
    static int H;
    static boolean flag=true;
    static {
        Scanner sc  = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();
        if( B <= 0 || H <= 0 ){
            flag = false;
        }
    }

    public static void main(String[] args) throws Exception {
        if(flag){
            int area=B*H;
            System.out.print(area);
        }else{
            throw new Exception("Breadth and height must be positive");
        }

    }//end of main

}//end of class

