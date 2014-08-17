package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class parameterisation {

	@Test(dataProvider="data")
	public static void employee(String name,String cls,String years){
		System.out.println("name :"+name);
		System.out.println("class :"+cls);
		System.out.println("years :"+years);
	}
	
	@DataProvider
	public Object[][] data(){
		Object data[][]=new Object[2][3];
		//1st set of data
		data[0][0]="Krishna";
		data[0][1]="4th";
		data[0][2]="5years";
		//2nd set of data
		data[1][0]="Mohan";
		data[1][1]="7th class";
		data[1][2]="12years";
		return data;
		
	}
	
}
