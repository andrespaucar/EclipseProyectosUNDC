package POO_herencia;

public class persona {
  
	String nombre;
	String apellido;
	int edad;
	public persona (String nombre,String apellido,int edad){
		//Constructor
		this.nombre=nombre;
		this.apellido=apellido;
		this.edad=edad;
	}
	
	public String getnombre (){
		return nombre;
	}
	public String getapellido(){
		return apellido;
	}
	public int getedad(){
		return edad;
	}
	
	public class profesor extends persona {
		private String idprofesor;
		public profesor (String nombre,String apellido,int edad){
			super(nombre,apellido,edad);//super es como llamar el constructor de arriva **//
			idprofesor="A02000B1";
		}
		
		public void setidprofesor(String idprofesor){
		this.idprofesor=idprofesor;
		}
		public String getidprofesor(){
			return idprofesor;
		}
		
		public void mostrarNombreApellidoYCarnet(){
			System.out.println("Profesor de nombre "+getnombre()+ " "+ getapellido()+" con id de profesor :  "+getidprofesor());
		}
	}
	
	
}

