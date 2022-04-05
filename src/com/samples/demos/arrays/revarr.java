package com.samples.demos.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class revarr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}

	}

}
