package com.andres.abstractas;

public abstract class Animal {
	private String nombre;
	public Animal(){}
	public void comer(){
		System.out.println("El "+ nombre+ " esta comiendo");
	}
	public abstract void moverse();
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
 
}
