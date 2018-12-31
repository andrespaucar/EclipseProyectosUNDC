package com.andre;

public class Car {
  double millasRecoridas;
  double gasInTank;
  double millasPorGallon;
  double distance;
  /*public Car(){
		millasRecoridas=0;
		gasInTank=0;
	}  */
  public void conducir(double distance){
	  millasRecoridas = millasRecoridas + distance;
      double gasConsumed = distance / millasPorGallon;
      gasInTank = gasInTank - gasConsumed;
      System.out.println("Las millas recoridas son:" + millasRecoridas);
      System.out.println(" El gas in Tank"+ gasInTank);

  }
  public void addGas(double cantidad){
	  gasInTank = gasInTank + cantidad;
  }
  
  
  public void setMillasPorGallon(double millasPorGallon) {
		this.millasPorGallon = millasPorGallon;
	}
  public void setMillasRecoridas(double millasRecoridas) {
		this.millasRecoridas = millasRecoridas;
	}
  public double getMillasRecoridas() {
		return millasRecoridas;
	}

	public double getGasInTank() {
		return gasInTank;
	}
	public void setGasInTank(double gasInTank) {
		this.gasInTank = gasInTank;
	}
	public double getMillasPorGallon() {
		return millasPorGallon;
	}
}
