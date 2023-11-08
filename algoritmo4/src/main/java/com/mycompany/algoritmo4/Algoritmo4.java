
package com.mycompany.algoritmo4;
import java.util.Scanner;
public class Algoritmo4 {

    public static void main(String[] args) {
        double costoporminutos,minutosconsumidosenelmes,costototal;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el costo por minutos: ");
        costoporminutos = teclado.nextDouble();
        System.out.println("Ingrese el numero de minutos consumidos en el mes: ");
        minutosconsumidosenelmes = teclado.nextDouble();
        costototal = costoporminutos * minutosconsumidosenelmes;
        System.out.println("El valor de la planilla de telefono de su casa es: " + costototal);


    }
}
