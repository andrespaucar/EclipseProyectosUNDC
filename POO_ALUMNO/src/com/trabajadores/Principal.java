package com.trabajadores;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer=new Scanner(System.in);
		Trabajador  tb=new Trabajador ();
		String nom,ape;
		int edad, horT,horE,STotal;
		nom=JOptionPane.showInputDialog("Nombre: ");
		ape=JOptionPane.showInputDialog("Apellido");
		edad=Integer.parseInt(JOptionPane.showInputDialog("edad"));
		horT=Integer.parseInt(JOptionPane.showInputDialog("Numero de horas Trabajadas:"));
		horE=Integer.parseInt(JOptionPane.showInputDialog("Horas Extras : "));
         tb.setApellido(ape);
         tb.setNombre(nom);
         tb.setEdad(edad);
         tb.setHorasTrab(horT);
         tb.setHorasEx(horE);
         
         tb.SueldoTrabajador();
         
         tb.SueldoTragajador2(nom, ape, edad, horT, horE);
	}

}
