package string.manipulation;

import java.util.Arrays;

public class palindrome_anagram {
	
	/* comparing each character from both ends till midway */
	public static boolean stringPalindrome_charAt(String arg){

		//take care of spaces for multiple words
		//make sure to turn all characters to lower case
		arg = arg.replaceAll(" ","").toLowerCase();
		//after that take the length

		int len = arg.length();
		for(int i=0; i< (len/2) ;i++){
			if(arg.charAt(i) != arg.charAt(len-1-i)){
				
				return false;
			}		
		}
		return true;

	}


	/* here the string is reversed and then compared to the origin string*/
	public static boolean palindrome_StringReverse(String str){

		str = str.replaceAll(" ", "").toLowerCase();
		String reversedStr="";
		int len = str.length();
		for(int i = len-1 ; i >= 0; i-- ){
			reversedStr = reversedStr + str.charAt(i);
		}
		return str.equals(reversedStr);
	}


	public static boolean anagram_using_arraySorting(String str1, String str2){
		if(str1.length() != str2.length()){
			return false;
		}
		str1 = str1.replaceAll(" ", "").toLowerCase();
		str2 = str2.replaceAll(" ", "").toLowerCase();
		char[] arr_Str1 = str1.toCharArray();
		char[] arr_Str2 = str2.toCharArray();

		Arrays.sort(arr_Str1);
		Arrays.sort(arr_Str2);
		//return String.valueOf(arr_Str1).equals(String.valueOf(arr_Str2));
		return Arrays.equals(arr_Str1,arr_Str2);
	}

	public static boolean anagram_UsingDeleteChar(String str1, String str2){
		int index;
		str1 = str1.replaceAll(" ","").toLowerCase();
		str2 = str2.replaceAll(" ","").toLowerCase();
		char[] arr_Str1 = str1.toCharArray();
		StringBuilder sbStr2 = new StringBuilder(str2);
		for(char c : arr_Str1){

			index = sbStr2.indexOf(""+c);
			if(index != -1){
				sbStr2.deleteCharAt(index);
			}else{
				return false;
			}
		}
		return sbStr2.length()==0 ? true : false;

	}



	public static void main(String[] args){
		
		
		System.out.println(stringPalindrome_charAt("AbcdefGhijiHgfedcba"));
		System.out.println(palindrome_StringReverse("abcdefghIjihGfedcbA"));
		System.out.println(anagram_using_arraySorting("Army1","1Mary"));
		System.out.println(anagram_UsingDeleteChar("Army1","1Mary"));


	}
	

}
