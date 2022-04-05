package com.samples.demos.abstractclass;

public abstract class bird extends animal {

	public bird(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	public void eat()
	{
		System.out.println(getName()+"is pecking");
	}
	public void breathe()
	{
		System.out.println(getName()+" is breathing");
	}
	
	public abstract void fly();
}
