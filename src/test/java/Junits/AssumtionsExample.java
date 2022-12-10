package Junits;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

public class AssumtionsExample {
	
	
	
	@BeforeAll
	public static void SetUp() {
		
		System.setProperty("ENV","DEV");
		
	}
	
	
	@Test
	public void test1() {
		
		
		assumeTrue("DEV".equals(System.getProperty("ENV")));
		assertTrue(StringFunction.palindrome("madam"));
		
	}

}
