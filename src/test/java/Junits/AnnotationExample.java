package Junits;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AnnotationExample {
	
	
	@BeforeAll
        public static void method3() {
		
		System.out.println("Inside The BeforAll");
	}
	
	@BeforeEach
	public void method1() {
		
		System.out.println("Inside The BeforeEach");
	}
	

	@Test
	public void addTest1() {
		
		assertEquals(9,Calculator.Add(5,4));
		assertTrue(true);
		
		String[] array1= {"One","Two","Three"};
		String[] array2= {"One","Two","Three"};
		assertArrayEquals(array1,array2);
		
		System.out.println("Inside The Test1");
		
		
	}
	

	@Test
	public void addTest2() {
		
		assertEquals(8,Calculator.Add(4,4));
		System.out.println("Inside The Test2");
		
	}
	
	@AfterEach
    public void method2() {
		
		System.out.println("Inside The AfterEach");
	}
	
    @AfterAll    
	public static void method4() {
		
		System.out.println("Inside The AfterAll");
	}

}
