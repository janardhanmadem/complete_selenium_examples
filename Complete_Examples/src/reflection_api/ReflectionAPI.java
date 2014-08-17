package reflection_api;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;



//import sun.reflect.Reflection;

//import com.google.common.reflect.Reflection;

public class ReflectionAPI {

	public static void main(String args[]) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Xls_Reader xls=new Xls_Reader("G://selenium//Selenium//test.xlsx");
		int r=xls.getRowCount("Sheet1");
		System.out.println(r);
	//"clicklink" TAKEN FROM XLSX;
		String meth=xls.getCellData("Sheet1", "MEMS", 2);
		//String meth=read name from xls file
		Method method= ReflectionAPI.class.getMethod(meth, String.class);
		method.invoke(method, "hello");
        System.out.println("end");
	}
	
	public static void clicklink(String x){
		System.out.println("clicklink :"+x);
	}
}
