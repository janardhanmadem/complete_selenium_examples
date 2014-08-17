package properties;

import java.io.FileInputStream;

import java.util.Properties;

public class readproperties {
	public static void main(String args[]) throws Throwable{
		System.out.println(System.getProperty("user.dir"));
		Properties prop=new Properties();
		FileInputStream ip=new FileInputStream(System.getProperty("user.dir")+"\\src\\properties\\emp.properties");
		prop.load(ip);
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));
		
		
	}

}
