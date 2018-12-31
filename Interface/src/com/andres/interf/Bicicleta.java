package com.andres.interf;

public class Bicicleta implements Rueda, Silla{
   public  Bicicleta() {}
   
	@Override
	public void avanzar() {
		// TODO Auto-generated method stub
		System.out.println("La bicicleta avanza");
	}

	@Override
	public void detenerce() {
		// TODO Auto-generated method stub
		System.out.println("La Bicicleta se detiene");
		
	}

	@Override
	public void sentarse() {
		// TODO Auto-generated method stub
		System.out.println("Te sentaste en la Bicicleta");
	}
  
}
