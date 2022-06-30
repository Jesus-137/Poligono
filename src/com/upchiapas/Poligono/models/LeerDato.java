package com.upchiapas.Poligono.models;

import java.util.Scanner;

public class LeerDato {
    public void lectura(){
        Scanner scanner=new Scanner(System.in);
        Punto p1=new Punto(0,0);
        Procesos proceso=new Procesos();
        proceso.definirPunto();
        int opcion;
        do {
            System.out.println("|-------------|");
            System.out.println("|---Menu------|");
            System.out.println("|-1_Trasladar-|");
            System.out.println("|-2_Escalar---|");
            System.out.println("|_____________|");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el valor de x para trasladar");
                    p1.setX(scanner.nextFloat());
                    System.out.println("Ingrese el valor de y para trasladar");
                    p1.setY(scanner.nextFloat());
                    proceso.trasladar(p1);
                    break;
                case 2:
                    System.out.println("Ingrese el valor de x para escalar");
                    p1.setX(scanner.nextFloat());
                    System.out.println("Ingrese el valor de y para escalar");
                    p1.setY(scanner.nextFloat());
                    proceso.escalar(p1);
                    break;
                default:
                    System.out.println("opcion no valida elija una opcion del menu");
                    break;
            }
        }while (opcion!=1&&opcion!=2);
    }
}
