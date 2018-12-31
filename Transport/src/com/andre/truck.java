package com.andre;

public class truck extends car {
     public void m1(){
    	 System.out.println("Camion 1");
     }
     public void m2(){
    	super.m1();
     }
     public String toString(){
    	 return super.toString()+super.toString();
     }
}
