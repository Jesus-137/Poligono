package com.upchiapas.Poligono.models;

import javax.swing.*;
import java.util.Scanner;

public class LeerDato {
    public void lectura(){
        Scanner scanner=new Scanner(System.in);
        Punto p1=new Punto(0,0);
        Procesos proceso=new Procesos();
        proceso.definirPunto();
        int opcion;
        do {
            String entrada = JOptionPane.showInputDialog(null,"_______________"+
                    "\n|----Menu-----|\n"+"|-1_Trasladar-|\n"+"|-2_Escalar---|\n"+"|_____________|");
            opcion = Integer.parseInt(entrada);
            switch (opcion) {
                case 1:
                    entrada=JOptionPane.showInputDialog(null,"Ingrese el valor de x para trasladar");
                    p1.setX(Float.parseFloat(entrada));
                    entrada =JOptionPane.showInputDialog(null,"Ingrese el valor de y para trasladar");
                    p1.setY(Float.parseFloat(entrada));
                    proceso.trasladar(p1);
                    break;
                case 2:
                    entrada=JOptionPane.showInputDialog(null,"Ingrese el valor de x para escalar");
                    p1.setX(Float.parseFloat(entrada));
                    entrada =JOptionPane.showInputDialog(null,"Ingrese el valor de y para escalar");
                    p1.setY(Float.parseFloat(entrada));
                    proceso.trasladar(p1);
                    break;
                default:
                    JOptionPane.showInputDialog(null,"opcion no valida elija una opcion del menu");
                    break;
            }
        }while (opcion!=1&&opcion!=2);
    }
}
