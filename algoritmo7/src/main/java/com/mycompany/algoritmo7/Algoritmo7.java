
package com.mycompany.algoritmo7;

import java.util.Scanner;

public class Algoritmo7 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Planilla de luz");
        System.out.println("Ingrese el valor del costo por kilovatio/hora:");
        double dato = teclado.nextDouble();
        System.out.println("Ingrese el numero de kilovatios consumidos en el mes:");
        double consumo = teclado.nextDouble();
        System.out.println("Ingese su edad:");
        int EDAD = teclado.nextInt();
        double valorcancelar = dato * consumo;
        if(EDAD >= 65){
            double descuento = (valorcancelar*0.9);
            System.out.println("El valor a cancelar con el descuento es: "+descuento);
        } else {
            System.out.println("El valor a cancelar es:"+valorcancelar);
        }
            
                
    }
}
