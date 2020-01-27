package hrank.problemSolving;


import java.lang.reflect.Field;
import java.lang.reflect.Method;

class myOpaqueClass{

    private String str ="Lets see if u can get me ";
    static String static_str = "I m constant";

    private void agentPrivateMethod(int a, int b){
        a = a+b;
    }

    public void publicAgentHere(int a , int b){
        b = a+b;
    }

    public void overloadMethod(int a){
        // i have many like me
    }

    public void overloadMethod(int a, int b){
        // i have many like me
    }
    public void overloadMethod(int a, int b, int c){
        // i have many like me
    }
    public void overloadMethod(int a, int b, int c, int d){
        // i have many like me
    }

}



public class java_refelction_api {


    public static void main(String[] args){


       Field[] fld =  myOpaqueClass.class.getDeclaredFields();
       Method[] meths =  myOpaqueClass.class.getDeclaredMethods();

        System.out.println("All fields below");
       for(Field fl : fld){
           System.out.println(fl.getName());
       }

        System.out.println("All methods below");
       for(Method m : meths){

           System.out.println(m.getName());

       }



    }








}
