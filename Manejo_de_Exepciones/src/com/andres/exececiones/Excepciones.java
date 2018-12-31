package com.andres.exececiones;

import java.util.Scanner;

public class Excepciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer=new Scanner(System.in);
		int x;// variable numerica
		System.out.println("Dame un valor numerico");
		
		try{
			x=leer.nextInt();
			System.out.println(x); //obtener un numero del teclado
			
		}catch(Exception e){
			e.printStackTrace(); /// muestra la pila de erores
			System.out.println("No me diste un valor numerico");
		}
		finally{
			System.out.println("Proceso terminado");
		}
		

	}

}
