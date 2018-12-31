package com.condori;

import javax.swing.JOptionPane;

public class ejer_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
      int n =Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de Empleado"));
      int codigo[]=new int[n];
	boolean condicion=true;
	String opcion;
      while (condicion==true) {
		
    for (int i = 0; i < n; i++) {
	codigo[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese Codigo de tres dijito: "));	
	}
	for (int i = 0; i < codigo.length; i++) {
		
		if (codigo[i]%2==0 && codigo[i]%3==0 && codigo[i]%5==0 ){
			JOptionPane.showMessageDialog(null,"Num "+(i+1)+ " UD. es Administrador");
		}
		else{
			if (codigo[i]%3==0 && codigo[i]%5==0 ){
			JOptionPane.showMessageDialog(null,"Num "+(i+1)+ " UD. es Directivo");
		}
			else if(codigo[i]%2==0  ){
				JOptionPane.showMessageDialog(null,"Num "+(i+1)+ " UD. es Vendedor");
			}
			else{
				JOptionPane.showMessageDialog(null,"Num "+(i+1)+ " UD. es Seguridad");

			}
		}
		
		
	}
	 opcion=JOptionPane.showInputDialog("DEse continuar ?");
      if(opcion.equals("no")){
    	  JOptionPane.showMessageDialog(null, "Gracias");
    	condicion=false;
      }
	
	}
     
      
   
	}

}
