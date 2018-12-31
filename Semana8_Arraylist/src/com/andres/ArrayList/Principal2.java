package com.andres.ArrayList;

public class Principal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		try{
			int []numeros={5,2,8};
			System.out.println(numeros[0]);
			System.out.println(numeros[1]);
			System.out.println(numeros[2]);
			System.out.println(numeros[3]);
			
		}catch(ArrayIndexOutOfBoundsException arrayE){
			System.out.println("Estas entrado a la localidad que no esta definida");
		}catch(Exception e){
			System.out.println("Ocurrio este error");
			e.printStackTrace();
		}finally{
			System.out.println(":)");
		}
		
		

	}

}
