package com.samples.demos;

public class Demo2operators {
public static void main(String args[])
{
	int res=1+3;
	res=res+20;
	System.out.println(res);
	res+=2;
	System.out.println(res);
	
	boolean istemp=true;
	if(istemp)
	{
		System.out.println("temp value");
	}
	
	boolean myflag=false;
	
	if(myflag)
	{
		System.out.println("1");
	}
	else {
		System.out.println("2");
	}
	
	int topscore=100;
	int secondtopscore=80;
	if(topscore>secondtopscore && topscore<=100)
	{
		System.out.println("just missed");
	}
	
	int age=20;
	
	String message=(age>=20) ? "can rent a car" : "wait for a while";
	System.out.println(message);
}
}
