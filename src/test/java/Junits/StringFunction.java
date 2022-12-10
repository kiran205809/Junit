package Junits;

import org.junit.jupiter.api.Test;

public class StringFunction {
	
	
	

	public static boolean palindrome(String str) {
		
	
	
	//String str ="madam";
	
	int start = 0;
	
	int end = str.length() -1;
	
	while(start<end) {
		
		if(str.charAt(start)!=str.charAt(end)) {
			return false;
		}
		start ++;
		end --;
		
	}
 return true;
}
}