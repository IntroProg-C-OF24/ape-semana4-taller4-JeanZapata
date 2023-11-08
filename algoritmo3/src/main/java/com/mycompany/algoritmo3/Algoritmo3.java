
package com.mycompany.algoritmo3;
import java.util.Scanner;
public class Algoritmo3 {

    public static void main(String[] args) {
        System.out.println("Tabla de multiplicar rango 2 a 6 ");
        System.out.println("Ingrese un numero:");
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        if (numero >= 2 && numero <= 6) {
            System.out.println("La tabla es: " + numero);

            for (int i = 1; i <= 10; i++) {
                int tabla = numero * i;
                System.out.println(numero + "*" + i + "=" + tabla);
            }
        }else{
            System.out.println("Numero no esta en el rango ");
        }
               
    }
}