package com.samples.demos.abstractclass;

public abstract class testabstract {

	public static void main(String[] args) {
		animal obj=new dog("doggy");
		obj.eat();
		obj.breathe();
		
		bird obj1=new parrot("parrot");
		obj1.eat();
		obj1.breathe();
		obj1.fly();
	}

}
