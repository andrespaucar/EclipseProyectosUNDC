package com.undc.andres;


import javax.swing.JOptionPane;
public class Ejercicio_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int nega=0,cn=0;
         int posi=0,cp=0;
        int cera=0;
		int numero[]=new int [5];
		
		for	(int i=0; i<5; i++){
			numero[i]=Integer.parseInt(JOptionPane.showInputDialog( "Numero : "));
			if(numero[i]>0){
				posi=posi+numero[i];
				cp=cp+1;
			}
			else{
				if(numero[i]<0){
					nega=nega+numero[i];
					cn=cn+1;
				}
				else{
					cera=cera+1;
				}
			}
		}
		JOptionPane.showMessageDialog(null, "Media de los Positivos : "+(float)posi/cp );
		JOptionPane.showMessageDialog(null,"Media de los negativos: "+(float)nega/cn);
		JOptionPane.showMessageDialog(null,"El numero de Ceros Ingresados son:  "+cera);
		
		
	}

}

