package com.andres.undc;

public class Geopunto {
	 double longitud,latitud;
	
	public Geopunto(double longitud, double latitud){
		this.longitud=longitud;
		this.latitud=latitud;
	}
	public String toString(){
		return "GeoPunto {"+ " latitud "+ latitud + ", Longitud "+ longitud+ " }"; 
	}
	public  double distancia(Geopunto punto){// esto es un MEDOTO
		final double RADIO_TIERRA=637100;
		double dLat = Math.toRadians(latitud - punto.latitud);
        double dLon = Math.toRadians(longitud - punto.longitud);
		double lat1 = Math.toRadians(punto.latitud);
		double lat2 = Math.toRadians(latitud);
	    double a =    Math.sin(dLat/2) * Math.sin(dLat/2) +   Math.sin(dLon/2) * Math.sin(dLon/2) * Math.cos(lat1) * Math.cos(lat2);
	    double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
		return c * RADIO_TIERRA; 

	}
	

}
