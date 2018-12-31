
package com.andres.practica;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int x=7;
   int y=++x*8;
   x=7;
   int z=x++*8;
   /*System.out.println(x);
   System.out.println(y);
   System.out.println(z);*/
   
   int i=1, s=0;
	while(i<10){
		if (i%2==0) {
			s=s+i;
		}
		i=i+1;
	}
	
   
	System.out.println(i);
	System.out.println(s);
	}
	

}
