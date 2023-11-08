
package com.mycompany.algoritmo9;

import java.util.Scanner;

public class Algoritmo9 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Calcular el area del poligono");
        System.out.println("Ingrese la altura del triangulo ");
        double altura = teclado.nextDouble();
        System.out.println("Ingrese el lado del cuadrado ");
        double lado = teclado.nextDouble();
        double areatotal = (Math.pow(lado,2))+(lado*altura)+((lado*altura)/2);
        System.out.println("El area total del poligono es "+areatotal);
                
        
        
    }
}
