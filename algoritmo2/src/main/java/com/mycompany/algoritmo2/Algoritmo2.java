
package com.mycompany.algoritmo2;
import java.util.Scanner;
public class Algoritmo2 {

    public static void main(String[] args) {
        double gastoshijo1;
        double gastoshijo2;
        double gastoshijo3;
        double gastostotales;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese gastos de hijo 1: ");
        gastoshijo1 = teclado.nextDouble();
        System.out.println("Ingrese gastos de hijo 2: ");
        gastoshijo2 = teclado.nextDouble();
        System.out.println("Ingrese gastos de hijo 3: ");
        gastoshijo3 = teclado.nextDouble();
        gastostotales = gastoshijo1 + gastoshijo2 + gastoshijo3;
        System.out.println("Total de gastos: " + gastostotales);

    }
}
