package com.andres.abstractas;

public class Perro extends Animal {

	public  Perro() {
		super();
		setNombre("Perro");
	}
    
	@Override
	public void moverse() {
		// TODO Auto-generated method stub
		System.out.println("El perro esta moviendo");
		
	}
   
}
