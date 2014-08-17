package exception_handling;

public class throws_example {

	public static void main(String args[]) throws Throwable{
		clicklink();
	}
	public  static void clicklink() throws 	Throwable{
		loadingpage();
	}
	public static void loadingpage() throws Throwable{
		System.out.println("A1");
		Thread.sleep(1000L);
		System.out.println("B1");
		Thread.sleep(1000L);
		
	}
}
