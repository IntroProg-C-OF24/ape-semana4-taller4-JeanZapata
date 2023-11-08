
package com.mycompany.algoritmo6;
import java.util.Scanner;
public class Algoritmo6 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Pago mensual");
        System.out.println("Ingresar monto del prestamo:");
        double monto = teclado.nextDouble();
        System.out.println("Ingrese el interes mensual a cobrar:");
        double interes = teclado.nextDouble();
        double pagomensual = (monto * (interes/100));
        System.out.println("El pago mensual es: "+pagomensual);
         
    }
}
