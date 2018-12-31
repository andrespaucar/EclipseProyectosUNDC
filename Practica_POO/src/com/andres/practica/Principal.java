package com.andres.practica;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Elevador elevadorChico=new Elevador(400, 5);
    System.out.println("Elevador chico peso "+ elevadorChico.pesoMaximo+ " Capacidad "+ elevadorChico.capacidadMaxPersona);
    
    Elevador elevadorGrande=new Elevador(800, 10);
    
    System.out.println(" Elevador chico peso "+ elevadorGrande.pesoMaximo+" Capacidad "+ elevadorGrande.capacidadMaxPersona);
    System.out.println(" Soy elevador chico ");
    elevadorChico.abrirPuertas();
    
    int piso=elevadorChico.bajarPiso(6);
    System.out.println(piso);
    
	}

}
