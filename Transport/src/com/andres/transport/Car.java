package com.andres.transport;

public class Car extends vehicle{
   private int nPass;
   
   public int enter(int n){
	   nPass+=n;
	   return nPass;
   }
   
   public void exit(int n){nPass-=n;   }
   public void moveForward(){
	   
   }
   
   public void moveBackard(){
	   
   }
   
   public String ToString(){
	   return "I an a Var eith " + nPass+ " pasajeros";
   }

public int getnPass() {
	return nPass;
}

public void setnPass(int nPass) {
	this.nPass = nPass;
}

@Override
public void moveBackward() {
	// TODO Auto-generated method stub
	
}

@Override
public String toString() {
	// TODO Auto-generated method stub
	return null;
}



   
}
