package Junits;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class RepeatedTestExamples {
	
	

	@RepeatedTest(3)
	public void addTest1() {
		
		assertEquals(9,Calculator.Add(5,4));
		
	}

}
