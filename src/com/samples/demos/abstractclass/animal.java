package com.samples.demos.abstractclass;

public abstract class animal {

	private String name;
	public animal(String name) {
		this.name=name;
	}
	public abstract void eat();
	public abstract void breathe();
	public String getName() {
		return name;
	}
	
}
