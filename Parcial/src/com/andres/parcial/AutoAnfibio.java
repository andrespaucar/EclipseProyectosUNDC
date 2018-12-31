package com.andres.parcial;

public class AutoAnfibio implements TransporteMaritimo, TransporteTerrestre {
	private String marca;
	private String modelo;

	public void nadar(){
		System.out.println("Estoy Adandoo!!");
		
	}
	public void andar(){
		System.out.println("Estoy Nadandoo!!");
	}

}
