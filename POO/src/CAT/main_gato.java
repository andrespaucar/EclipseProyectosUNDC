package CAT;
import CAT.gato;
import javax.swing.JOptionPane;

public class main_gato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       gato cat=new gato();
       cat.nombre=JOptionPane.showInputDialog("Nombre Cat: ");
       cat.edad=Integer.parseInt(JOptionPane.showInputDialog(null, "edad Cat: "));
       cat.sexo=JOptionPane.showInputDialog("sexo del gato: ");
       cat.color_ojo=JOptionPane.showInputDialog("Ingrese color de ojo: ");
       System.out.println("Nombre del gato: " +cat.gatonombre());
       System.out.println("El color de ojos del gato es: "+cat.gatocolor_ojo());
       cat.mostrar_datos(); 
	}

}
