package com.andres.practica;

public class Nodo {
	private String color;
    private Nodo siguiente;
    
    public Nodo(String color) {
        this.color = color;
    }
    public void poner(Nodo siguiente_nodo) {
        siguiente = siguiente_nodo;
    }
    public Nodo coger() {
        return siguiente;
    }
    public String color() {
        return color;
    }

}
