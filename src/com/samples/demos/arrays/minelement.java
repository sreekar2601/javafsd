package com.samples.demos.arrays;
import java.util.*;
public class minelement {
	public static void getmin(int arr[])
	{
	  Arrays.sort(arr);
	  int min=arr[0];
	  System.out.println(min);
		
		
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		getmin(arr);
	}

}
