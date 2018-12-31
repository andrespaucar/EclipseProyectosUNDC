package andres.undc;
import javax.swing.JOptionPane;
public class bidimencional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String [][] descripcion=new String [2][2];
      descripcion[0][0]="Nombre real: David Fernandez Casas";
      descripcion[0][1]="Dato: Hijo de Sebastian Fernandez y de la Eterno Vida. Imponente luchador del bien contra el mal ";
      descripcion[1][0]="Habilidad 1: Amparo De Vida (Reduce daño de ataques magicos)";
      descripcion[1][1]="Habilidad 3: Aviador sin Nave (Inmune a ataques terrestres / Precision y Evasion incrementada)";
	
      JOptionPane.showMessageDialog(null, "Nombre real: David Fernandez CasasNombre real: \n "
      		+ "David Fernandez CasasNombre real: David Fernandez Casas \n"
      		+ "Nombre real: David Fernandez CasasNombre real: David Fernandez Casas \n"
      		+ "Nombre real: David Fernandez CasasNombre real: David Fernandez Casas \n"
      		+ "Nombre real: David Fernandez CasasNombre real: David Fernandez Casas \n"
      		+ "Nombre real: David Fernandez CasasNombre real: David Fernandez Casas \n"
      		+ "Nombre real: David Fernandez CasasNombre real: David Fernandez Casas \n"
      		+ "Nombre real: David Fernandez CasasNombre real: David Fernandez Casas \n"
      		+ "Nombre real: David Fernandez CasasNombre real: David Fernandez Casas \n"
      		+ "Nombre real: David Fernandez CasasNombre real: David Fernandez Casas \n");
      for (int i = 0; i < descripcion.length; i++) {
    	  for (int j = 0; j < descripcion.length; j++) {
					JOptionPane.showMessageDialog(null, descripcion[i][j]);

		}
	}
      
	}

}
