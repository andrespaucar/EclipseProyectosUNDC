package paquete;

import javax.swing.JOptionPane;

public class numero{
	int num1;
	int num2;
  numero(){
	  num1=0;
	  num2=0;
  }
  numero(int num1,int num2){//me sirvira para ingresar los datos 
	  this.num1=num1;
	  this.num2=num2;
  }
  void verificar(int num1,int num2){
	  if(num1==num2){
		  JOptionPane.showMessageDialog(null, "Los numeros ingresados son iguales XD");
	  }else{
		  if(num1>num2){
			  JOptionPane.showMessageDialog(null, "El numero mayor es: "+num1);
		  }else{
			  JOptionPane.showMessageDialog(null, "El numero mayor es: "+num2);
		  }
	  }
  }
	
}