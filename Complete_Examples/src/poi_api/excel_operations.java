package poi_api;

import reflection_api.Xls_Reader;

public class excel_operations {
	public static void main(String args[]){
		Xls_Reader xls=new Xls_Reader("G://selenium//Selenium//poitest.xlsx");
		//to get row count
		int r=xls.getRowCount("Sheet1");
		System.out.println("No of rows :" + r);
		
		//to get columns count
		int c=xls.getColumnCount("Sheet1");
		System.out.println("no of columns :"+c);
		
		//set data in to xlsx
		xls.setCellData("Sheet1", "name", 5, "Home");
		
		//print data
		String data=xls.getCellData("Sheet1", "name", 2);
		System.out.println(data);
		
		String data2=xls.getCellData("Sheet1", "name", 5);
		System.out.println(data2);
		
	}

}
