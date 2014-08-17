package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class handling_errors {

	@Test
	public static void test2(){
		System.out.println("Gmail test started");
		System.out.println("Before assertion error");
		try{
			Assert.assertTrue(6<1,"Error message");
		}catch(Exception e){
			System.out.println("error message :"+e.getMessage());
			e.printStackTrace();
			Assert.assertFalse(1<9,"error message");
			System.out.println("After assertion error");
		}
	}
}
