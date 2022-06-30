package com.upchiapas.Poligono.models;

public class Imprime {
    public void imprecion(Punto[] puntos){
        for (int i=0; i<4; i++) {
            System.out.println("El punto "+(i+1)+" queda en: " + puntos[i].getX()+","+puntos[i].getY());
        }
    }
}
