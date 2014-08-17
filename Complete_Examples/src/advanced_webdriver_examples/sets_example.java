package advanced_webdriver_examples;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class sets_example {
	public static void main(String args[]){
		Set<String> s=new HashSet<String>();
		s.add("india");
		s.add("korea");
		s.add("Germany");
		//s.add("india"); duplicates are not allowed
		System.out.println("Total no of elements :"+s.size());
		//not allowed System.out.println(s.get(2));
		Iterator<String> iter=s.iterator();
		System.out.println(iter.hasNext());
		System.out.println(iter.next());
		//retriving all data
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
	}

}
