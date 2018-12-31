package com.andres.abstractas;

public class Ave extends Animal{
	public Ave(){
		super();
		setNombre("ave");
	}

	@Override
	public void moverse() {
		// TODO Auto-generated method stub
		System.out.println("El ave esta volando");
	}
}
