package auto;

import java.util.Random;

import auto.auto;
public class Main_auto {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
	   auto autoUno=new auto();
	   auto autoDos=new auto("ferrari",2000,"Deportivo", 2016);
		autoUno.marca="Bugati";
		autoUno.año=2017;
		autoUno.precio=20000;
		autoUno.tipo="Deportivo";
		Random rd;
		 rd=new Random();
		 Random rd2=new Random();
		int a,b;
		a=rd.nextInt(10);
		b=rd2.nextInt(20);
		 int suma=a+b;
		System.out.println(a);
		System.out.println(b);
		System.out.println("Suma es: "+suma);
		autoUno.despliegaAuto(autoUno.marca,autoUno.tipo,autoUno.año);
		System.out.println(" ");
		autoDos.despliegaAuto();
	}

}
