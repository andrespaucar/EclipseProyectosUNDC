package com.undc.andres;

import javax.swing.JOptionPane;

public class arreglo_nombre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String nombre[]=new String[5];
	for (int i = 0; i <5; i++) {
		nombre[i]=JOptionPane.showInputDialog((i+1)+" ingrese nombre");
		
	}
	for (int i = 0; i < 5; i++) {
		JOptionPane.showMessageDialog(null,(i+1)+". "+nombre[i]);
		
	}
	
	JOptionPane.showMessageDialog(null,"1. "+nombre[0]+"\n2. "+nombre[1]+"\n3."+nombre[2]+"\n4."+nombre[3]+"\n5."+nombre[4]);

	}

}
