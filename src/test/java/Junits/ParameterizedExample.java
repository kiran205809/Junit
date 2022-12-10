package Junits;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

import java.time.Month;

public class ParameterizedExample {
	
	
	
	@ParameterizedTest
	
	@ValueSource(strings = {"madam","radar","Kiran"} )
	public void test1(String name) {
		
		assertTrue(StringFunction.palindrome(name));
		
	}
	
	
	@ParameterizedTest
	@ValueSource(ints= {2,3,4,5})
	public void test2(int num) {
		
		assertTrue(num%2==0);
		
	}
	
	@ParameterizedTest
	@EnumSource(Month.class)
   public void test3(Month month) {
		
		int monthval= month.getValue();
		System.out.println(monthval);
		
		assertTrue(monthval<=12);
	   
   }
}
