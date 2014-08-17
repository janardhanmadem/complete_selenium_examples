package testng;



import org.testng.Assert;
import org.testng.annotations.Test;

public class assertions {
	
	@Test
	public static void test1(){
		System.out.println("Yahoo news tests");
		Assert.assertEquals("good", "good");
		Assert.assertTrue(6<1,"error message");
		Assert.assertFalse(2<1,"error message");
		
	}

}
