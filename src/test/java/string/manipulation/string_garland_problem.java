package string.manipulation;

import java.util.Scanner;

public class string_garland_problem {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String box1 = sc.nextLine();
        String box2 = sc.nextLine();
        String output = "";
        if(box2.length() < box1.length()){
            String temp =  box1;
            box1 = box2;
            box2 = temp;
        }
        int i;
        for(i=0 ; i< box1.length() ; i++ ){
            output = output+String.valueOf(box1.charAt(i))+String.valueOf(box2.charAt(i));
        }

        if(i<box2.length()){
            output = output+box2.substring(i);
        }

        System.out.println(output);
    }
}
