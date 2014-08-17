package collections_api;
public class Hashtable {
	public static void main(String[] args){
		java.util.Hashtable<String,String> table=new java.util.Hashtable<String,String>();
		//injecting data into hash table
		table.put("name","janardhan");
		table.put("serial","2");
		table.put("profession","doctor");
		//get data by using key
		System.out.println(table.get("name"));
		//altering the name
		table.put("name","kiran");
		System.out.println(table.get("name"));
		
		
		
	}

}
