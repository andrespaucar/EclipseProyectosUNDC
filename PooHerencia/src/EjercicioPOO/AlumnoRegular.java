package EjercicioPOO;

public class AlumnoRegular extends Alumno { /// ATRIBUTOS
     private char categoria;
      private double pago;
      private double seguro;
      private double incremento;
      private char ingles;
      private double adicional;
      private double total;
      
      public AlumnoRegular(String nombre,String apellido,double pago, char ingles){//CONSTRUCTOR
    	  super(nombre,apellido);
    	  this.incremento=incremento;
    	  this.ingles=ingles;
    	  this.pago=pago;

      }
      public void mostrarDats(){
    	  if(ingles=='S'|| ingles=='s'){
    			adicional=75.20;
    		}else{
    			adicional=0;
    		}
    	  seguro=0.2;
    	  incremento=pago*0.2;
    	  total=incremento+adicional+pago;
    	  super.mostrarDats();
    	 
    	 System.out.println("Pago del Seguro: "+ incremento);
    	 System.out.println("Pago Total: "+total);
      }
      
      
	public char getCategoria() {
		return categoria;
	}
	public void setCategoria(char categoria) {
		
	}
	public double getPago() {
		return pago;
	}
	public void setPago(double pago) {
		this.pago = pago;
	}
	public double getSeguro() {
		return seguro;
	}
	public void setSeguro(double seguro) {
		this.seguro = seguro;
	}
	public double getIncremento() {
		return incremento;
	}
	public void setIncremento(double incremento) {
		this.incremento = incremento;
	}
	public char getIngles() {
		return ingles;
	}
	public void setIngles(char ingles) {
		this.ingles = ingles;
	}
	public double getAdicional() {
		return adicional;
	}
	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}    
}
