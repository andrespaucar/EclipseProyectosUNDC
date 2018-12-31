package com.andres.undc;

public class Telefono {
	private int id;
	private String marca;
	 String modelo;
	 private double precio;
	 
	 // constructor sin parametros
	
	 public Telefono(){// Constructor de circle
		 this.id=0;
		 this.marca="Motorola";
		
	 }
	 //declaracion del metodo
	 public void mostrarDatos(){
		 System.out.println("MOstrar datos "+id);
	 }
	 // get || set  -- sourse / generate setter and getter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}

 

}