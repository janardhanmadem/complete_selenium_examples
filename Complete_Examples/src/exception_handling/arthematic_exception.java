package exception_handling;

public class arthematic_exception {
	public static void main(String args[]){
		System.out.println("A");
		try{
			System.out.println("A1");
			int i=8/0;
			System.out.println("B1");
		}catch(Exception e){
			System.out.println("error" +e.getMessage());
			e.printStackTrace();
		}
		System.out.println("B2");
	}

}
