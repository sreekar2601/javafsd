package com.samples.demos.colletions;
import java.util.*;
public class testArrayList {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		List<Integer> ar=new ArrayList<>();
		for(int i=0;i<n;i++) {
			ar.add(sc.nextInt());
		}
		for(Integer arr:ar)
		{
			System.out.println(arr);
		}
		
		
	}

}
