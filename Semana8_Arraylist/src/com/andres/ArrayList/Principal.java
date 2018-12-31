package com.andres.ArrayList;

import java.util.ArrayList;
import java.util.Vector;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> androids=new ArrayList<String>();
		androids.add("Cuput");
		androids.add("Eclair");
		androids.add("Frcake");
		androids.add("Donoyo");
		androids.add("Gingerbrad");
		androids.add("Ice Cream Sandwitch");
		androids.add("Jelly Bean");
		androids.add("Kit kat");
		androids.add("Lollipop");
		androids.add("Mashmallow");
		
		System.out.println("Tamaño del ArrayList: "+androids.size());
		System.out.println("androids: "+ androids);
		
		androids.remove(3);
		androids.remove(4);
		System.out.println("Tamaño del ArrayList: "+ androids.size());
		System.out.println("android: "+androids);
		
		Vector <String> androidsV2=new Vector<String>();
		
		androidsV2.addElement("Ice Cream Sandwitch");
		androidsV2.addElement("Jelly bean");
		androidsV2.addElement("kit kat");
		androidsV2.addElement("Lollipop");
		androidsV2.addElement("Marshmallow");

		System.out.println("Tamaño de Vector: "+androidsV2.size());
		System.out.println("android: "+androidsV2);
		
		androidsV2.remove(4);
		System.out.println("Tamaño del vector: "+androidsV2.size());
		System.out.println("androidsV2: "+ androidsV2);

	}

}
