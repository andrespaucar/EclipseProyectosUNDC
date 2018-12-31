package com.andres.undc;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Geopunto punto1, punto2;
       double z;
       punto1=new Geopunto(35.6895000, 139.6917100);
       punto2=new Geopunto(34.604,58.382);
       
       punto1.distancia(punto2);
       z=punto1.distancia(punto2);
       System.out.println("Distancia: "+ punto1.toString());
       System.out.println("Distancia: "+ z);
	}

}
