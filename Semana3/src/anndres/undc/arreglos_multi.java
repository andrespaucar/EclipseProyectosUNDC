package anndres.undc;

import javax.swing.JOptionPane;

public class arreglos_multi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int mat[][]=new int [4][4];
       int j=1,i=1,c=0,p=0,n=0;
       for (i =1; i <4; i++) {
    	   for (j = 1; j <4;
    			   j++) {
			mat[i][j]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Valor: "));
			if (mat[i][j]==0) {
				c++;
				//indicar caltidad de datos ingresados positivos
				//indicar cantidad de datos ingresados negativos
				
			}
			if(mat[i][j]>0){
				p=p+1;
			}
			if(mat[i][j]<0){
		     n=n+1;
			}
		}
    	   
	}
       JOptionPane.showMessageDialog(null,"El numero de ceros es: " + c);
       JOptionPane.showMessageDialog(null,"Numero positivos ingresados : "+p);
       JOptionPane.showMessageDialog(null, "Numeros negativos : "+n);
	}

}
