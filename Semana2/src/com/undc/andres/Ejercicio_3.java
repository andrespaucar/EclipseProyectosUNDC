package com.undc.andres;
import javax.swing.JOptionPane;
public class Ejercicio_3 {
 public static void main (String [] arg){
	 
	 String produc[]=new String [10];
	 int precio[]=new int [10];
	 
	 for (int i = 0; i < produc.length; i++) {
		produc[i]=JOptionPane.showInputDialog("Nombre Producto: ");
		precio[i]=Integer.parseInt(JOptionPane.showInputDialog("Precio del Producto: "));
		
		
	}
	 int c=1;
	 for (int i = 0; i < precio.length && i<produc.length; i++) {
		 if (precio[i]>30) {
				JOptionPane.showMessageDialog(null,"Nª "+c +" "+ produc[i]+" "+precio[i]);
				
			}
		 c=c+1;
	}
	 
 }
}
