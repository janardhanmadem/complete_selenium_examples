package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class basic_flow {

	@Test
	public static void testreceivemail(){
		System.out.println("Testing receive mail");
	}
	@Test
	public static void testsendmail(){
		System.out.println("Testing sending mail");
		
	}
	@BeforeMethod
	public static void beforemethod(){
		System.out.println("before method");
		System.out.println("Opening the browser");
	}
	@BeforeTest
	public static void beforetest(){
		System.out.println("before test");
		System.out.println("Connecting to db");
	}
	@BeforeSuite
	public static void beforesuite(){
		System.out.println("before suite");
		System.out.println("Creating the driver");
	}
	@AfterSuite
	public static void aftersuite(){
		System.out.println("after suite");
		System.out.println("destroy the driver");
	}
	@AfterMethod
	public static void aftermethod(){
		System.out.println("after method");
		System.out.println("Closing the browser");
	}
	@AfterTest
	public static void aftertest(){
		System.out.println("after test");
		System.out.println("disconnecting the db");
	}
}
