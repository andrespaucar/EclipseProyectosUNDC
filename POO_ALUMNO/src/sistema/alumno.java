package sistema;

public class alumno { // se declaran variables(atributos)
  int numCta;         // de la clase Alumno
  String nombre;
  int edad;
  String direccion;
  int cveCarrera;
  
  public alumno(){        /*Primer constructor de la clase Alumno*/
	  numCta=0;     //Se pueden tener varios Constructores
	  nombre=null;  //Cuya funcion en este ejemplo es la de 
	  edad=0;        // Inicializar las variables de la clase
	  direccion=null;  //No tiene ningun parametro
	  cveCarrera=0;
	  
  }
  public alumno(int numCta, String nombre,int edad,String direccio,int cveCarrera){//Declaracion del segundo constructor
	  this.numCta=numCta; // la palabra "this"= se refiere solo a las variables de este metodo //
	  this.nombre=nombre;
	  this.edad=edad;
	  this.direccion=direccio;
	  this.cveCarrera=cveCarrera;
  }
  void despliegaDatos(int cveCarrera,String nombre,int edad){//Se utiliza polimorfirmo (por sobrecarga)
	  //Con este metodo que tiene 2 formas, este es con parametros
	  System.out.println("El metodo con parametros los datos son: ");
	 System.out.println("Nombre: "+nombre);
	 System.out.println("Edad: "+edad+"  Cve de la Carrera: "+cveCarrera);
  }
  void despliegaDatos(){
	  /*Se utiliza el mismo metodo ahora sin parametros */
	  System.out.println("En el metodo sin parametros son: ");
	  System.out.println("Cta= "+numCta+" Nombre: "+nombre+" edad:"+edad+" Direccion: "+direccion+
			  " Cve de la Carrera: "+cveCarrera);
	  
  }
  
}
