package com.andre;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Car auto=new Car();
     double millasR,gasInTank,millasPorG,CantGas,distancia;
     JOptionPane.showMessageDialog(null, "CAR SAC");
     millasR=Integer.parseInt(JOptionPane.showInputDialog("Ingrese MillasRecorridas"));
     gasInTank=Integer.parseInt(JOptionPane.showInputDialog("Ingrese Gas In Tank"));
     millasPorG=Integer.parseInt(JOptionPane.showInputDialog("Ingrese millas por Galon"));
     auto.setMillasRecoridas(millasR);
     auto.setMillasPorGallon(millasPorG);
     auto.setGasInTank(gasInTank);
     CantGas=Integer.parseInt(JOptionPane.showInputDialog("Cantidad Adicional de GAS"));
     auto.addGas(CantGas);
     distancia=Integer.parseInt(JOptionPane.showInputDialog("Distancia que Recorrera el auto"));
     auto.conducir(distancia);
     
    
     
	}

}
