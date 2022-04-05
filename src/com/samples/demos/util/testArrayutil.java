package com.samples.demos.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class testArrayutil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[]=new String[] {"sam","wilson","john","william","robert"};
		List<String> li=Arrays.asList(str);
		System.out.println(li);
		
		li.set(0, "mark");
		System.out.println(Arrays.toString(str));
		System.out.println(li);
		
		Arrays.sort(str);
		System.out.println(Arrays.toString(str));
		
		List<String> lis=new ArrayList<>();
		lis.add("evans");
		lis.add("paul");
		lis.add("benedict");
		lis.add("tom");
		
		System.out.println(lis);
		String arr[]= {"andrew"};
		Collections.addAll(lis, arr);
		System.out.println(lis);
		
		
		

	}

}
