
package com.mycompany.algoritmo8;

import java.util.Scanner;

public class Algoritmo8 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Valor total a pagar mensual de servicios digitales");
        System.out.println("Ingrese el valor a pagar de Netflix");
        double netflix = teclado.nextDouble();
        System.out.println("Ingese el valor a pagar de Youtube Premiun");
        double youtubepremiun = teclado.nextDouble();
        System.out.println("Ingeese el valor a pagar de Dropbox");
        double dropbox = teclado.nextDouble();
        System.out.println("Ingrese el vlaor a pagar de Spotify");
        double spotify = teclado.nextDouble();
        double valortotal = netflix + youtubepremiun + dropbox + spotify;
        System.out.println("Ingrese su edad");
        int edad = teclado.nextInt();
        if( edad <=30){
            double descuento = valortotal * 0.8;
            System.out.println("El valor a cancelar con el descuento es "+descuento);
            
        }else{
            System.out.println("El valor a pagar por los servicios digitales es "+valortotal);
        }
    }
}
