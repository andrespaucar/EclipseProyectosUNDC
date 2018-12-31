package Ejercicio;

import javax.swing.JOptionPane;
public class PrinciapPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		persona perso=new persona();
    System.out.println();
     String nom=JOptionPane.showInputDialog("nombre");
     String amigo=JOptionPane.showInputDialog("Amigos");
 
     perso.setName(nom);
     perso.setFriends(amigo);
      JOptionPane.showMessageDialog(null, "La persona "+perso.getName()+ " . Su amido es: "+perso.getFriends());
     persona a;
     a=new persona("andres","kevin");
	System.out.println("DATOS: "+a.toMostrar());
	}

}
