package com.andres.transport;

import java.util.Scanner;

public class Ejecutable {
public static void main(String[] args){
	Scanner read=new Scanner(System.in);
	System.out.println("Ingrese la cantidad");
	
	Car car=new Car();
	
	int n=read.nextInt();
	System.out.println(car.enter(n));
	System.out.println(car.ToString());
	
}
}
