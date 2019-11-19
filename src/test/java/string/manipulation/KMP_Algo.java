package string.manipulation;

public class KMP_Algo {



    public static int search_patter_kmp(String str, String pattern){

        int[] lcp = calculate_lps(pattern);
        int len = str.length();
        int plen = pattern.length();
        int i=0;
        int j=0;
        while(i < len){
            if(str.charAt(i) == pattern.charAt(j)){
                i++;
                j++;
            }else if (j == 0){
                i++;
            }else{
                j = lcp[j-1];
            }

             if(j == plen){
                 System.out.println("Found the patter at index : "+ (i-j));
                 return (i-j);
             }
        }
        System.out.println(" pattern not found ");
        return -1;

    }

    public static int[] calculate_lps(String pattern){

        int plen = pattern.length();
        int[] lcp = new int[plen];
        int i = 0;
        int j = 1;


        while(j < plen){

            if(pattern.charAt(i) == pattern.charAt(j)){
                i++;
                lcp[j] = i;
                j++;
            }else if(i == 0){
                lcp[j] = 0;
                j++;
            }else{
                i--;
            }

        }
    return lcp;

    }


    public static void main(String[] args){

        String str1="ABABDABACDABABCABAB";
        String str2="ABABCABAB";

        System.out.println(search_patter_kmp(str1,str2));
        //calculate_lps("AAABAAA");

    }
}
