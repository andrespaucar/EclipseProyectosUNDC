package anndres.undc;

import javax.swing.JOptionPane;

public class EjercicioLoo2 {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
		  boolean op=true;
		String nombre[]=new String [2];
				int edad[]=new int [2];
	      while (op==true) {
	    	  int opcion=Integer.parseInt(JOptionPane.showInputDialog("1. Reguistrar Datos"+"\n"+
			"2. Mostrar Datos"+"\n 3. Finalizar \n"));
		switch (opcion) {
			case 1:
				for (int i = 0; i < 2; i++) {
					nombre[i]=JOptionPane.showInputDialog(null,"Ingrese Nombre ");
					edad[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Edad: "));
				}
				break;
			case 2:
				if (nombre[0]==null) {
					JOptionPane.showMessageDialog(null, "No hay datos Almacenados \n Por favor almacene datos");

				}
				else {
					for (int i = 0; i < 2; i++) {
					JOptionPane.showMessageDialog(null, "Registro "+(i+1)+": "+nombre[i]+
							"\n Edad: "+edad[i]);
			}
				}
			
			break;
			
			default:
				JOptionPane.showMessageDialog(null, "Gracias !!");
				op=false;	
				
	     break;
			}
		}
		}
		
		

	}


