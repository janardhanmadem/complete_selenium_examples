package string_operations;

public class sample_1 {
	public static void main(String args[]){
		
		String str="The rains have been started here";
		//to find  string length
		System.out.println(str.length());
		//to find position of letter
		System.out.println(str.indexOf("s"));
		//to find position of letter after some index
		System.out.println(str.indexOf("s",9));
		//to find particular string present or not
		System.out.println(str.indexOf("hello"));
		//to print particular string in a given string
		System.out.println(str.substring(6,10));
		
		
		
		//comparing between two strings
		String str1="The rains are not started here";
		//compare with other string
		System.out.println(str.equals(str1));
		
		//split function
		
		String temp[]=str.split("");
		System.out.println(temp[2]);
		for(int i=0;i<temp.length;i++){
			System.out.println(temp[i]);
		}
				
		
		
	}

}
