package com.andre.undc;

public class Playera extends Ropa {
	private String corte;
	
	public Playera(int id,double precio, String talla, String color,String corte){
		super(id,precio,talla,color);
		this.corte=corte;
	}

	public String getCorte() {
		return corte;
	}

	public void setCorte(String corte) {
		this.corte = corte;
	}
	

}
