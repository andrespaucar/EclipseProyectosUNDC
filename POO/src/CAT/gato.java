package CAT;

import javax.swing.JOptionPane;

public class gato {
	String nombre;
	int edad;
	String sexo;
	String color_ojo;
	
	gato(){
		nombre=null;
		edad=0;
		sexo=null;
		color_ojo=null;
		
	}
	public String gatonombre(){
		return this.nombre;
	}
	public String gatocolor_ojo(){
		return this.color_ojo;
	}
	gato(String nombre,int edad,String sexo,String color_ojo){
		this.nombre=nombre;
		this.sexo=sexo;
		this.color_ojo=color_ojo;
	}
	void mostrar_datos(){
		JOptionPane.showMessageDialog(null, "El Gato: "+nombre+" edad: "+edad+" sexo: "+sexo+" color de ojos: "+color_ojo);
	}
	
	

}
