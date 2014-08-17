package exception_handling;

public class nullpointer_exception {
	
	public static void main(String args[]){
		System.out.println("A");
		try{
			System.out.println("A1");
			login l=null;//There is no object in which reference is pointing
			l.name="g";
			System.out.println("B1");
			
		}catch(Exception e){
			System.out.println("error"+e.getMessage());
			e.printStackTrace();
		}
		System.out.println("B2");
	}
	}


