package andres.undc;

import javax.swing.JOptionPane;

public class Trabajo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*De 12 alumnos de un curso se ingresa:
		 nota del 1° trimestre, nota del 2° trimestre, nota del 3° trimestre.
		 El orden del ingreso coinside con su numero de lista que es de 1 al 12.
		 En otra columna se debe calcular el promedio de las 3 notas.
		 El almno uno de ve de ingrasar sus tres notas para calcular el promedio 1 del alumno
		 uno, y despues deve de mostrar los nombres y las notas y promedios de cadad alumnno
		 */
	 int alum[][]=new int [4][3];
	 int tri[]=new int [4];
	 int pro[][]=new int [4][3];
	
	for (int i = 0; i < 4; i++) {
		 for (int j = 0; j < 3; j++) {
			alum[i][j]=Integer.parseInt(JOptionPane.showInputDialog("Alumo "+(i+1)+" Ingrese nota de "+(j+1)+"ª bimestre"));
			tri[i]=alum[i][j]+tri[i];
			pro[i][j]=alum[i][j]+pro[i][j];
			System.out.println(alum[i][j]);
			
		}
		 System.out.println();
		 System.out.println((float)tri[i]/3);
		 System.out.println();
		 
		 
	}
	
	 for (int i = 0; i < 4; i++) {
		 for (int j = 0; j < 3; j++) {
	JOptionPane.showMessageDialog(null,"Notas del Alumno "+(i+1)+" son: "+
			"\n "+"nota "+(1)+": "+ alum[i][0]+" \n nota "+(2)+": "+alum[i][1]+"\n nota "+(3)+": "+alum[i][2]
					+"\n Promedio es: "+(float)tri[i]/3);
           j=3;
		}
	 
	 }
 }
}
