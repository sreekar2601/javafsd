package com.samples.demos.colletions;
import java.util.*;
public class Navigableset 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NavigableSet<Integer> st=new TreeSet<>();
		st.add(77);
		st.add(22);
		st.add(33);
		st.add(44);
		st.add(55);
		System.out.println(st);
		
		System.out.println(st.lower(55));
		System.out.println(st.floor(55));
		System.out.println(st.ceiling(55));
		System.out.println(st.higher(55));
		
		System.out.println(st.first());
		System.out.println(st.last());
		System.out.println(st.descendingSet());
		
		System.out.println(st.headSet(55,true));

		st.add(25);
		System.out.println(st);
		
	}

}
