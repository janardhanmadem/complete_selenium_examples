package exception_handling;

public class exception_selenium {
public static void main(String args[]){
	clicklink();
}
public static void clicklink(){
	loadpage();
	
}
public static void loadpage(){
	try{
		int i[]=new int[3];
		i[3]=303;
	
	}catch(Exception e)
	{
		System.out.println("error"+e.getMessage());
		e.printStackTrace();
	}
}
}
