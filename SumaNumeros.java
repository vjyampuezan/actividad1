

package com.mycompany.sumanumeros;

import java.util.Scanner;



public class SumaNumeros {

    public static void main(String[] args) {
        
        System.out.println("");
        System.out.println("programa para sumar dos numeros ");
        System.err.println("");
        
        int n1, n2, suma;

        Scanner teclado = new Scanner( System.in );

        System.out.print( "Introduzca primer número: " );
        n1 = teclado.nextInt();

        System.out.print( "Introduzca segundo número: " );
        n2 = teclado.nextInt();

        suma = n1 + n2;

        System.out.println( "La suma de " + n1 + " más " + n2 + " es " + suma + "." );
   
    }
}
