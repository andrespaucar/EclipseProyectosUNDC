package undc.andres;

import javax.swing.JOptionPane;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	nimpar();
	}
	static void  nimpar(){
		int suma=0;
		
		int n=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero:"));
		
		for (int i = 1; i <=n; i++) {
			if (i%2==0) {
		     
			}else{
				suma=suma+i;
			}
		}
		JOptionPane.showMessageDialog(null, "Impares: "+suma);

	}
	static void mayor(){
		int a,b,c;
		a=Integer.parseInt(JOptionPane.showInputDialog("a: "));
		b=Integer.parseInt(JOptionPane.showInputDialog("b: "));
		c=Integer.parseInt(JOptionPane.showInputDialog("c: "));
        if (a>b && a>c) {
		JOptionPane.showMessageDialog(null, "El mayor es:"+a);
	   }
        else{
        	if (b>a && b>c) {
    		JOptionPane.showMessageDialog(null, "El mayor es:"+b);
    	 }
        	else{
        		JOptionPane.showMessageDialog(null, "El mayor es:"+c);

        	}
        }
        
	}

}
