package Junits;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	
	
	@Test
	public void addTest1() {
		
		assertEquals(9,Calculator.Add(5,4));
		
	}
    
	@Disabled
	
	@Test
	public void subTest1() {
		
		assertEquals(1,Calculator.sub(5,4));
		
	}
}
