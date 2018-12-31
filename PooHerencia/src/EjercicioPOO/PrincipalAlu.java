package EjercicioPOO;
import java.util.Scanner;
public class PrincipalAlu {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		 boolean corect=true;
		 Scanner leer=new Scanner(System.in);		 
		String nombre, apellido;
		char ingles,categoria;
		byte matricula = 0, creditos;
		double pago;
		System.out.println("Nombre: ");
		nombre=leer.next();
		System.out.println("Apellidos: ");
		apellido=leer.next();
	    System.out.println("TIPOS DE MATRICULAS");
		System.out.println("1. Matricula Regular \n 2. Matricula Credito");
		matricula=(byte) leer.nextInt();
		if (matricula==1) {
			System.out.println("Categoriaas de Pagos");
			System.out.println("A : 790.40");
			System.out.println("B : 650.80");
			System.out.println("C : 580.20");
			categoria=leer.next().charAt(0);
			  if(categoria=='A'){
	    		  pago=790.40;
	    	  }else{
	    		  if(categoria=='B'){
	    			pago=650.80;
	    		  }else{
	    			  pago=580.20;
	    		  }
	    	  }
			  System.out.println("¿Decea estudiar Ingles? S/N");
	            ingles=leer.next().charAt(0);
			  AlumnoRegular AR=new AlumnoRegular(nombre, apellido, pago, ingles);
			  AR.mostrarDats();
		}else{
			if(matricula==2){
				
				System.out.println("Numero de Creditos");
				creditos=leer.nextByte();
				System.out.println("¿Decea estudiar Ingles? S/N");
	            ingles=leer.next().charAt(0);
				AlumnoCredito AC=new AlumnoCredito(nombre,apellido, creditos,ingles );
                AC.mostrarDats();
			}else{
				System.out.println("Opcion Incorrecta :(");
			}
		}
		

	}
}
