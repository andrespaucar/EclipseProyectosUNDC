package com.undc.andres;
import javax.swing.JOptionPane;
public class arreglo_Dos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int t[]=new int [5];
		
		for(int i=0;i<5 ;i++){
			t[i]=Integer.parseInt(JOptionPane.showInputDialog("Numero "));
			
		}

		JOptionPane.showMessageDialog(null,"NUmeros son: ");
		for(int i=4; i>=0;i--){
			JOptionPane.showMessageDialog(null, +t[i]);
		}
	}

}
