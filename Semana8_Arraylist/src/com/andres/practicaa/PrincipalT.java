package com.andres.practicaa;

public class PrincipalT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple apple = new Apple();
		Orange orange=new Orange();
		Tiger tiger=new Tiger();
		Chicken chicken=new Chicken();
		System.out.println(apple.comoComer());
		System.out.println(orange.comoComer());
		System.out.println(tiger.sound());
		System.out.println(chicken.sound());
		System.out.println(chicken.comoComer());
	}
}