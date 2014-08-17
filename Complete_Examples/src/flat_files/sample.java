package flat_files;

import java.io.*;


public class sample {
	public static void main(String args[]) throws Throwable{
		//creating file
		File f=new File("G://selenium//Selenium//testing//temp.txt");
		f.createNewFile();
		//writing in to created file
		FileWriter w=new FileWriter("G://selenium//Selenium//testing//temp.txt");
		@SuppressWarnings("resource")
		BufferedWriter out=new BufferedWriter(w);
		out.write("hello students");
		out.newLine();
		out.write("this is java class");
		out.flush();
		
		//reading file
		FileReader r=new FileReader("G://selenium//Selenium//testing//temp.txt");
		@SuppressWarnings("resource")
		BufferedReader bfr=new BufferedReader(r);
		String x="";
		System.out.println(bfr.readLine());
		System.out.println(bfr.readLine());
		
		//returning whole text
		while((x=bfr.readLine())!=null){
			System.out.println(x);
		}
		
		
	}

}
