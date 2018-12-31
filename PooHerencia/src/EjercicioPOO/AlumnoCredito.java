package EjercicioPOO;
public class AlumnoCredito extends Alumno {
 private double credito;
 private char ingles;
 private double pago;
 private double total;
 private int carnet;
 private double adicional; 
 
 public AlumnoCredito(String nombre,String apellido,double credito,char ingles){
     super(nombre,apellido);
	 this.credito=credito;
	 this.ingles=ingles;
 }
public void mostrarDats(){
	if(credito>10){
		carnet=18;}
	if(ingles=='S'|| ingles=='s'){
		adicional=75.20;
	}else{
		adicional=0;}
	double credTotal=credito*45.10;
	pago=credTotal;
	total=credTotal+carnet+adicional;
	super.mostrarDats();
	System.out.println("Precio por carnet: "+carnet);
	System.out.println("Pago(creditos y ingles): "+pago);
	System.out.println("Total: "+ total);	
 }
public double getCredito() {
	return credito;
}
public void setCredito(double credito) {
	this.credito = credito;
}
public char getIngles() {
	return ingles;
}
public void setIngles(char ingles) {
	this.ingles = ingles;
}
public double getPago() {
	return pago;
}
public void setPago(double pago) {
	this.pago = pago;
}
public double getTotal() {
	return total;
}
public void setTotal(double total) {
	this.total = total;
}
public int getCarnet() {
	return carnet;
}
public void setCarnet(int carnet) {
	this.carnet = carnet;
}
public double getAdicional() {
	return adicional;
}
public void setAdicional(double adicional) {
	this.adicional = adicional;
}
 
}
