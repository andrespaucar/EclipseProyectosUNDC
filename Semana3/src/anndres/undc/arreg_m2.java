package anndres.undc;

import javax.swing.JOptionPane;

public class arreg_m2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fil=Integer.parseInt(JOptionPane.showInputDialog("Filas: "));
		int col=Integer.parseInt(JOptionPane.showInputDialog("Columnas: "));
       int matA[][]=new int [fil][col];
       int matB[][]=new int [fil][col];
       int matR[][]=new int [fil][col];
       
       System.out.println("Matriz A ");
       for (int i = 0; i < fil; i++) {
    	   for (int j = 0; j < col; j++) {
         matA[i][j]=Integer.parseInt(JOptionPane.showInputDialog("NUMERO "));
         System.out.print(matA[i][j]+" ");
		}
    	   System.out.println();
	}
       
       System.out.println("MATRIZ B");
       for (int i = 0; i < fil; i++) {
    	   for (int j = 0; j < col; j++) {
         matB[i][j]=Integer.parseInt(JOptionPane.showInputDialog("NUMERO "));
         System.out.print(matB[i][j]+" ");
		}
    	   System.out.println();
	}
       
       System.out.println("SUMA");
       for (int i = 0; i < fil; i++) {
    	   for (int j = 0; j < col; j++) {
    		   matR[i][j]=matA[i][j]+matB[i][j];
    		   System.out.println("Suma de matriz: "+matR[i][j]);
		}
    	   System.out.println();
	}
       
       
       //el producto
       //resta
       
       

	}

}
