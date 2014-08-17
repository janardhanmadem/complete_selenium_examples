package arrays;

public class Single_dimensional_array {
	public static void main(String args[]){
	
		String a[]=new String[4];
		 a[0]="Welcome to";
		 a[1]="First Automation class";
		 a[2]="Lets continue";
		 a[3]="the class";
		 //print length of array
		 System.out.println("array length :"+ a.length);
		 //print array
		 for(int i=0;i<a.length;i++){
			 System.out.println("array index "+i+" value : "+a[i]);
		 }
		 
		 
	}
 
 
}
