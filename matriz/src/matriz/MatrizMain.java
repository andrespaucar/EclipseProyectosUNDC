package matriz;

import javax.swing.JOptionPane;

public class MatrizMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] A=new int[3][4];
		int[][] B=new int[4][5];
		
		System.out.println("Ingrese los datos del matriz A");
		int fil=Integer.parseInt(JOptionPane.showInputDialog("Filas: "));
		int col=Integer.parseInt(JOptionPane.showInputDialog("Columnas: "));
		System.out.println("Ingrese los datos del matriz B");
		int fil2=Integer.parseInt(JOptionPane.showInputDialog("Filas2: "));
		int col2=Integer.parseInt(JOptionPane.showInputDialog("Columnas2: "));
       int matA[][]=new int [fil][col];
       int matB[][]=new int [fil2][col2];
      
       
       System.out.println("Matriz A ");
       for (int i = 0; i < fil; i++) {
    	   for (int j = 0; j < col; j++) {
         matA[i][j]=Integer.parseInt(JOptionPane.showInputDialog("NUMERO "));
         System.out.print(matA[i][j]+" ");
		}
    	   System.out.println();
	}
       
       System.out.println("MATRIZ B");
       for (int i = 0; i < fil2; i++) {
    	   for (int j = 0; j < col2; j++) {
         matB[i][j]=Integer.parseInt(JOptionPane.showInputDialog("NUMERO "));
         System.out.print(matB[i][j]+" ");
		}
    	   System.out.println();
	}
       
       
	}

}
