package coreJavaTraining;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a=new ArrayList<String>();
		
		a.add("shashi");
		a.add("reddy");
		
		//System.out.println(a);
		/* adding  new value to arraylist*/
		a.add(1,"bhushan");
		System.out.println(a);
		/*
		removing a value with index 
		
		a.remove(1);
		System.out.println(a);
		
		
		removing a value with value 
		a.remove("reddy");
		System.out.println(a);*/
		
		System.out.println(a.get(0));
		System.out.println(a.indexOf("reddy"));
		System.out.println(a.contains("reddy"));
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		
	}

}
