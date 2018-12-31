package com.andres.transport;

public class Truck extends vehicle {
	private int carga;
	public void carga(int n){carga +=n;}
	public void exit(int n){carga -=n;}
	
	public void moveForward(){
		
	}
	public void moveBackard(){
		
	}
	public String toString(){
		return "I am a truck with "+carga+" Kilos of carga";
	}
	public int getCarga() {
		return carga;
	}
	public void setCarga(int carga) {
		this.carga = carga;
	}
	@Override
	public void moveBackward() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String ToString() {
		// TODO Auto-generated method stub
		return null;
	}

   
}
