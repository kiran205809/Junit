package PackageA;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

public class ClassATest {
	
	
	@Test
	@Tag("sanity")
	public void test1() {
		
		System.out.println("Inside The Test1");
	}

}
