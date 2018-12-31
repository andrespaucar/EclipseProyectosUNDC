package EjercicioPOO;
public class Alumno {
   private double pagt;
   private String nombre;
   private String apellido;
 public Alumno(){
	   nombre=null;
	   apellido=null;
	   pagt=0;
   }
   public Alumno( String nombre,String apellido){	   
	   this.nombre=nombre;
	   this.apellido=apellido;	
   } 
   public void mostrarDats(){  
     System.out.println("Nombre: "+getNombre());
  	 System.out.println("Apellido: "+getApellido());
   }  
public double getPagt() {
	return pagt;
}
public void setPagt(double pagt) {
	this.pagt = pagt;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}
public double getPmensual() {
	return pagt;
}
public void setPmensual(double pmensual) {
	pagt = pmensual;
} 
}
