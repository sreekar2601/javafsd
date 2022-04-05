package com.samples.demos.abstractclass;

public  class dog extends animal {

	public dog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	public void eat()
	{
		System.out.println(getName()+"is eating");
	}
	public void breathe()
	{
		System.out.println(getName()+" is breathing");
	}

}
