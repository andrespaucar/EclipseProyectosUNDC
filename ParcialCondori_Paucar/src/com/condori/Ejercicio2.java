package com.condori;

import javax.swing.JOptionPane;

public class Ejercicio2 {

	public static void main(String[] args) {
	divisores();
	
	}
	static void divisores(){
		int x,y;
		int d1=0;
		int d2=0;
		x=Integer.parseInt(JOptionPane.showInputDialog("Numero 1"));
		y=Integer.parseInt(JOptionPane.showInputDialog("Numero 2"));
		for (int i = 1; i < x; i++) {
			if (x%i==0) {
				d1=d1+i;
				}
		}
		for (int i = 1; i < y; i++) {
			if (y%i==0) {
				d2=d2+i;		
			}
		}
		JOptionPane.showMessageDialog(null, "La suma de los divisores para el numero "+x+ " ES: "+d1);
		JOptionPane.showMessageDialog(null, "La suma de los divisores para el numero "+y+" ES: "+d2);
		if (d1==d2) {
			JOptionPane.showConfirmDialog(null, "La suma de los divisores de los numeros son iguales");
		JOptionPane.showMessageDialog(null, "Pertenece a la misma categoria");
		}else{
			JOptionPane.showMessageDialog(null, "No pertene al misma categoria");
		}
	}
	}
