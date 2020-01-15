package recursion_Dynamic_programming;

public class recursion_stepsClimbing {

    public static int recur_factorial(int n){


        int[] arr = new int[n+1];
        arr[1] = 1;
        arr[2] = 2;
       //return recur_factorial(n-1) + recur_factorial(n-2);
        for(int i = 3; i <= n; i++){
            System.out.println(i);
            arr[i] = arr[i-1] + arr[i-2];
        }

        return arr[n];


    }




    public static void main(String[] args){
        int n = 40;
        long timeStart = System.currentTimeMillis();
        System.out.println("Factorial of "+ n + " is " + recur_factorial(n));
        long timeEnd = System.currentTimeMillis();
        long time = timeEnd-timeStart;
        System.out.println("Time take in ms " + time);
    }

}
