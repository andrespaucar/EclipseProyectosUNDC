package com.andres.practica;

public class Elevador {
    public int pesoMaximo;
    public int capacidadMaxPersona;

    //constructor
    public Elevador(int pm, int c) {

        pesoMaximo=pm;
        capacidadMaxPersona=c;
    }

    public int subirPiso(int pisoActual) {
        int nuevoPiso = pisoActual + 1;
        return nuevoPiso;
    }

    public int bajarPiso(int pisoActual) {
        int nuevoPiso = pisoActual - 1;
        return nuevoPiso;
    }

    public void abrirPuertas() {
        System.out.println("Estoy abriendo puertas");
    }

    public void cerrarPuertas() {
        System.out.println("Estoy cerrando puertas");
    }

}
