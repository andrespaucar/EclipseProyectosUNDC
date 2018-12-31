package com.andres.practicaa;

public  class Chicken extends Animal implements Comestible {
	public Chicken(){}
	
	
	public String sound(){
		return "soy un Chicken y mi sonido es.GGRRRRR";
		
	}


	@Override
	public String comoComer() {
		// TODO Auto-generated method stub
		return "El Chicken esta Comiendo";
	}

}
