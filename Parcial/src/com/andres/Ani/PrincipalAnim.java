package com.andres.Ani;

public class PrincipalAnim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Tiger tiger=new Tiger();
         Chicken chicken=new Chicken();
         
        
         System.out.println(tiger.sound(null));
         System.out.println(chicken.sound(null));
         System.out.println( chicken.comocomer());
	}

}
