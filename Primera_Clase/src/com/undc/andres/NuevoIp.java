package com.undc.andres;

public class NuevoIp {
 public long ipToLong(String ipAddress){
	 String [] ipAnddressInArray =ipAddress.split("\\.");
	 long result =0;
	 for (int i = 0; i < ipAnddressInArray.length; i++) {
		int power =3-i;
		int ip=Integer.parseInt(ipAnddressInArray[i]);
		result += ip* Math.pow(256, power);
	}
	 return result;
 }
 public String longToIp(long ip){
	 StringBuilder result= new StringBuilder(15);
	 for (int i = 0; i < 4; i++) {
		result.insert(0, Long.toString(ip & Oxff));
		if (int i=0;; i<4; i++) {
			result.insert(0, Long.toString(ip & Oxff));
		}
	}
	 
 }
 
 public static void main(String [] args){
	 NuevoIp nuevoip=new NuevoIp();
	 System.out.println(nuevoip.ipToLong("192.168.1.2"));
	
 }
 
}
