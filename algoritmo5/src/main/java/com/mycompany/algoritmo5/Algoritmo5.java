
package com.mycompany.algoritmo5;
import java.util.Scanner;
public class Algoritmo5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Costo total de una PC");
        System.out.println("Ingrese el costo del CPU: ");
        double CPU = teclado.nextDouble();
        System.out.println("Ingrese el costo del teclado: ");
        double TECLADO = teclado.nextDouble(); 
        System.out.println("Ingrese el costo de la pantalla: ");
        double pantalla = teclado.nextDouble();
        System.out.println("Ingrese el costo del raton: ");
        double raton = teclado.nextDouble();
        double costototal = CPU + TECLADO + pantalla + raton;
        System.out.println("El costo total es: "+costototal);
        
    }
}
