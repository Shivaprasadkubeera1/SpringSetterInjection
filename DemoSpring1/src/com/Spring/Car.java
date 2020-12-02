package com.Spring;

public class Car {
	public void setName(String name) {
		this.name = name;
	}

	Engine engine;
	String name;
	int id;
	String model;
	
	public void setEngine(Engine engine ) {
		this.engine = engine;
	}

	public String display() {
		return "Hey! this is "+engine.getModel()+" having id:"+engine.id+" and model:"+engine.model;
	}
}
