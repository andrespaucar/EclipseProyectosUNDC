package com.andre.undc;

public class PrincipalHerancia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Playera playera=new Playera(1, 299.5, "CH", "AZUL", "Polo");
		Jeans jeans=new Jeans(2, 799, "32", "verde", "Skinny", 'F');
		Calcetin calcetin=new Calcetin(3, 29, "M", "Rojo");
		
		playera.mostrarDatos("Playera Gris");
		jeans.mostrarDatos("Jeans Mujer");
		calcetin.mostrarDatos("Calcetines");

	}

}
