package collections_api;

import java.util.ArrayList;

public class array_list {
	public static void main(String[] args){
		ArrayList<String> list=new ArrayList<String>();
		//adding elements to list
		list.add("A");
		list.add("345");
		//list.add(345); doesnot allow bz array list is String type
		list.add("janrdhan");
		//to know size of list
		System.out.println(list.size());
		//to print particular element
		System.out.println(list.get(2));
		//to print all elements in list
		for(int i=0;i<list.size();i++){
			System.out.println(i+ " "+list.get(i));
		}
		
	}

}
