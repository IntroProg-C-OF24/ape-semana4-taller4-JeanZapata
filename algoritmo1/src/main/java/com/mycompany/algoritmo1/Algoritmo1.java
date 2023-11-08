
package com.mycompany.algoritmo1;
import java.util.Scanner;
public class Algoritmo1 {

    public static void main(String[] args) {
        double base;
        double altura;
        double area;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la base del triangulo: ");
        base = teclado.nextDouble();
        System.out.println("Ingrese la altura del triangulo: ");
        altura = teclado.nextDouble();
        area = (base*altura) / 2;
        System.out.println("El area del triangulo es: " + area);
        
        
    }
}
