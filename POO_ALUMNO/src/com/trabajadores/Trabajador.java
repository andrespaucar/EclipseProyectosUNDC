package com.trabajadores;

public class Trabajador { // Atributos
	private String nombre;
    private String apellido;
    private int edad;
    private  int HorasTrab;
    private int HorasEx;
    
    public Trabajador(){ // Constructor
    	nombre=null;
    	apellido=null;
    	edad=0;
    	HorasEx=0;
    	HorasTrab=0;
    }
    
    public Trabajador(String nombre, String apellido,int edad, int HorasTrab, int HorasEx){
     this.nombre=nombre;
     this.apellido=apellido;
     this.edad=edad;
     this.HorasEx=HorasEx;
     this.HorasTrab=HorasTrab;
    }
     void SueldoTrabajador(){
    	 int ST;
    	 ST=HorasTrab*50+HorasEx*100;
    	 System.out.println(" SIN PARAMETROS ");
    	 System.out.println("Sr. "+nombre+ apellido+ " de edad: "+ edad);
    	 System.out.println("Horas trabajadas "+ HorasTrab+ " Tus Horas Extras son: "+ HorasEx);
    	 System.out.println("Sueldo TOTAL: "+ST);
    	 System.out.println("NOTA: Sueldo por hora extra es de: 100 por hora :) ");
     }
     void SueldoTragajador2(String nombre, String apellido,int edad, int HorasTrab, int HorasEx){
    	 int ST;
    	 ST=HorasTrab*50+HorasEx*100;
    	 System.out.println( "CON PARAMETROS ");
    	 System.out.println("Sr. "+nombre+ apellido+ " de edad: "+ edad);
    	 System.out.println("Horas trabajadas "+ HorasTrab+ " Tus Horas Extras son: "+ HorasEx);
    	 System.out.println("Sueldo TOTAL: "+ST);

    	 System.out.println("NOTA: Sueldo por hora extra es de: 100 por hora :) ");
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getHorasTrab() {
		return HorasTrab;
	}

	public void setHorasTrab(int horasTrab) {
		HorasTrab = horasTrab;
	}

	public int getHorasEx() {
		return HorasEx;
	}

	public void setHorasEx(int horasEx) {
		HorasEx = horasEx;
	}
    


}
