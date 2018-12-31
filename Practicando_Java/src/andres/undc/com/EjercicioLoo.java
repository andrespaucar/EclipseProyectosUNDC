package andres.undc.com;
import javax.swing.JOptionPane;
public class EjercicioLoo {

	public static void main(String[] args) {
		/*int a[]=new int[5];
		int b[]=new int[5];
		int c[]=new int[5];
		
		for (int i = 0; i < a.length; i++) {
		
			a[i]=Integer.parseInt(JOptionPane.showInputDialog( "Primeros Numeros : "));
		}
		for (int i = 0; i < b.length; i++) {
			b[i]=Integer.parseInt(JOptionPane.showInputDialog("Segundos Numeros :"));
			
		}
		for (int i = 0; i < c.length; i++) {
			c[i]=a[i]+b[i];
		}
		for (int i = 0; i < c.length; i++) {
			JOptionPane.showMessageDialog(null, "Suma "+c[i]);
		}
		*/
		int n =Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de Emplados"));
		int empleado[]=new int[n];
		
		
        for (int i = 0; i < empleado.length; i++) {
			empleado[i]=Integer.parseInt((JOptionPane.showInputDialog("Ingrese Sueldo de Empleado")));

        	while (empleado[i]<800) {
        		
    			empleado[i]=Integer.parseInt((JOptionPane.showInputDialog("Ingrese Sueldo de Empleado")));

        	}

					
        }
        int suma=0;
        for (int i = 0; i < empleado.length; i++) {
		    suma=suma+empleado[i];
		}
        float pro= (float)suma/n;
        for (int i = 0; i < empleado.length; i++) {
			if (pro>empleado[i]) {
				JOptionPane.showInputDialog("Sueldo Inferior "+ empleado[i]);
			
		    }
		}
        
	}

}
