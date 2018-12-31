package sistema;
import sistema.alumno;
public class Main_alumno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     alumno alUno=new alumno();//se utiliza el primer consteuctor
     alumno alDos=new alumno(752,"Andres Paucar",19,"cañete",34); //
     alUno.nombre="Yoel Condori";
     alUno.edad=20;
     alUno.cveCarrera=15;
     alUno.direccion="Lima";
     alUno.numCta=241;
     alUno.despliegaDatos(alUno.cveCarrera,alUno.nombre,alUno.edad);
     alDos.despliegaDatos();
	}

}
