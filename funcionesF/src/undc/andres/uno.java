package undc.andres;

import javax.swing.JOptionPane;

public class uno {
 public static void main (String [] arg){
	 
	 int a, b,c,t;
	 a=Integer.parseInt(JOptionPane.showInputDialog("Ingrese Numero A"));
	 b=Integer.parseInt(JOptionPane.showInputDialog("Ingrese NUmero B"));
	 
	 c=suma(a,b);
	 t=resta(a,b);
	 JOptionPane.showMessageDialog(null, "Suma es: "+c);
	 JOptionPane.showMessageDialog(null,"resta es: "+t);
	 
 }
 static int suma(int a, int b){
	 int c;
	 c=a+b;
	 return (c);
 }
 static int resta(int a,int b){
	 int r;
	 r=a-b;
	 return (r);
 }
}
