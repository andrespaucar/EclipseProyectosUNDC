package com.undc.andres;
import javax.swing.JOptionPane;
public class arreglo_Tres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int n[]=new int [12];
		int suma=0;
		for	(int i=0; i<=11;i++){
			n[i]=Integer.parseInt(JOptionPane.showInputDialog("Nota: "));
			suma=suma+n[i];
		}
	  JOptionPane.showMessageDialog(null,"Media: "+(float)suma/12);
	}

}
