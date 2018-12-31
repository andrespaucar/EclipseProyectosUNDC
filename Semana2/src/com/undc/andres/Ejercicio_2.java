package com.undc.andres;
import javax.swing.JOptionPane;
public class Ejercicio_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		int x=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Cantidad de Personas"));
		String nombre[]=new String[x];
		String apellido[]=new String[x];
		for (int  i = 0; i < x; i++) {
			
		 nombre[i]=JOptionPane.showInputDialog("Nombre");
		 apellido[i]=JOptionPane.showInputDialog("Apellidos");
				
			
			
		}
		for (int i = 0; i < x; i++) {
			JOptionPane.showMessageDialog(null,nombre[i]+" "+apellido[i]);
		}
	}

}
