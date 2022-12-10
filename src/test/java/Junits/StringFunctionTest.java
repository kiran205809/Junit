package Junits;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class StringFunctionTest {
	
	
	@Test
	public void test1() {
		
		assertTrue(StringFunction.palindrome("madam"));
	}
	
	@Test
    public void test2() {
    	assertFalse(StringFunction.palindrome("Kiran"));
    }
}
