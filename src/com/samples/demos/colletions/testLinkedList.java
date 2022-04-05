package com.samples.demos.colletions;
import java.util.*;
public class testLinkedList {
	public static void main(String args[])
	{
		List<String> li=new LinkedList<String>();
		li.add("mumbai");
		li.add("hyderabad");
		li.add("chennai");
		li.add("goa");
		
		
		
		Iterator<String> it=li.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//System.out.println("--------------------------------------");
		/*for (Iterator iti= li.iterator(); iti.hasNext();) {
	         System.out.println(iti.next());
		}
		*/
		
		System.out.println("--------------------------------------");
		Iterator<String> ity = li.iterator();
		while (ity.hasNext()) {
			String element = ity.next();
			if (element.equalsIgnoreCase("mumbai")) {
				System.out.println("removing mumbai..");
				ity.remove();
			}
			System.out.println("Now visiting... " + element);			
		}
		
		System.out.println("--------------------------------------");
		for (Iterator iti= li.iterator(); iti.hasNext();) {
	         System.out.println(iti.next());
		
	    System.out.println("--------------------------------------");
	         
	    System.out.println(li.contains("mumbai"));
	    System.out.println(li.indexOf("goa"));
	    //System.out.println(li.equal("hyderabad"));
		
		
		
	}

	}
}
