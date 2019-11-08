package string.manipulation;

public class sdeldeye {

    public static void permutate(String str, int left, int right){

        if(left==right){
            System.out.println(str);
        }else{

            for(int i=left;i<=right; i++){
                str = swapchar(str,left,i);
                permutate(str,left+1,right);
            }

        }


    }

    public static String swapchar(String str1, int i, int k){
        char temp;
        char[] str =str1.toCharArray();

        temp=str[i];
        str[i]=str[k];
        str[k]=temp;

        return String.valueOf(str);
    }


    public static void main(String[] args){
        permutate("MANS",0,3);
    }
}
