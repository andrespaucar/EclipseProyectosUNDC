package com.undc.andres;
import javax.swing.JOptionPane;
public class arreglo_Uno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//JOptionPane.showMessageDialog(null,"mensaje");
		int x,y,s;
		x=Integer.parseInt(JOptionPane.showInputDialog("Numero 1:"));
		y=Integer.parseInt(JOptionPane.showInputDialog("Numero 2:"));
		
		s=y+x;
		JOptionPane.showMessageDialog(null,"Suma: "+s);
		

	}

}

