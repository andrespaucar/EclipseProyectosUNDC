package com.andres.Ani;

public class Chicken extends Animal implements Comestible {
   

	public String sound(String sound){
    	 return "Soy un Chicken y mi sonido es PIPPIIPI";
    	 
     }
     
	@Override
	public String comocomer() {
		// TODO Auto-generated method stub
		return "Es pollito esta comiendo";
	}
}
