package string.manipulation;

public class palindrome_anagram {
	
	
	public static boolean stringPalindrome_charAt(String arg){
		int len = arg.length();
		
		for(int i=0; i< (len/2) ;i++){
			
			if(arg.charAt(i) != arg.charAt(len-1-i)){
				
				return false;
			}		
		}
		return true;

	}
	
	
	public static void main(String[] args){
		
		
		System.out.println(stringPalindrome_charAt("redividerdetartrated"));
		
	}
	

}
