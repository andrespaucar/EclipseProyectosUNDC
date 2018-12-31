package com.condori;

import javax.swing.JOptionPane;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 
   
      
      reguistro();
  
    
      
       
	}
	static void reguistro(){
        boolean opcion = true;

		 while (opcion==true) {
	         int n=Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad a reguistrar"));
	       String op;
		  int salario[]=new int [n];
	      String nombre[]=new String[n];
	      int edad []=new int [n];
	      int dni[]=new int [n];
	      String apellido[]=new String [n];
	      String categoria[]=new String[n];
	    	    for (int i = 0; i <n; i++) {
	    	    	  nombre[i]=JOptionPane.showInputDialog("Ingrese Nombre"+(i+1)+": ");
	    	    	  apellido[i]=JOptionPane.showInputDialog("ingrese su apellido: ");
	    			  edad[i]=Integer.parseInt(JOptionPane.showInputDialog("Edad: "));
	    			  dni[i]=Integer.parseInt(JOptionPane.showInputDialog("DNI: "));
	    			  categoria[i]=JOptionPane.showInputDialog("Ingrese categoria (tecnico,asistente y funcionario");
	    			  salario[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese Salario"));
	    		}
	    	      for (int i = 0; i <n; i++) {
	    	    	  if (edad[i]>35 && categoria[i].equals("asistente")|| salario[i]>=850) { 
	    	    		  JOptionPane.showMessageDialog(null, "Sr. "+nombre[i]+" "+apellido[i]+"\n"+
	    	    				  edad[i]+" "+categoria[i]+" \n"
	    	    				  +"Salario: "+salario[i]);
	    				
	    			}
	    			
	    		}
	    	 
	    	 
			op=JOptionPane.showInputDialog("Desea continuar");
			if (op.equals("si") || op.equals("Si")) {
				
			}
			else {
				JOptionPane.showMessageDialog(null, "Graciass");
				opcion=false;
			}
		}
	}

}
