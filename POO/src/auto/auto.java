package auto;

public class auto {//Se despliega las varialbles (atributos) de la clase AUTO 
	String marca;
	int precio;
	String tipo;
	int año;
	
	 auto(){//Primer constructor de la clase AUTO || inicializamos variables
		marca=null;
		tipo=null;
		año=0;
		precio=0;
	}
	 auto(String marca,int precio,String tipo,int año){
		this.marca=marca;
		this.precio=precio;
	    this.tipo=tipo;
	    this.año=año;
	}
	void despliegaAuto(String marca,String tipo,int año){
		System.out.println("Con parametros || Depliega menu");
	    System.out.println("Marca del coche: "+marca+" tipo: "+tipo+" año: "+año);
	}
	void despliegaAuto(){
		System.out.println("Sin parametros || despliega menu");
		System.out.println("Marca del auto: "+marca+ " tipo:"+tipo+" año:"+año);
	}
	
	class kia extends auto{
		void despliegaAuto(String marca,String tipo,int año){
			System.out.println("Con parametros || Depliega menu");
		    System.out.println("Marca del coche: "+marca+" tipo: "+tipo+" año: "+año);
		}
	}

}
