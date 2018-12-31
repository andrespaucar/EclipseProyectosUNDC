package com.andres.transport;

public abstract class vehicle implements Movable {
	private String color;
	private Engine engine;
	
	public abstract void moveForward();
	public abstract void moveBackward();
    public abstract String toString();
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
    
    
}
