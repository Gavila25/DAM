/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.iesptodelacruz.GFAM;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Practica32 {
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca dos números enteros positivos");

        int num1 = sc.nextInt();sc.nextLine();

        System.out.println("Introduzca el segundo número");

        int num2 = sc.nextInt();sc.nextLine();

        if(num1 > num2){
            int aux = num2;
            num2 = num1;
            num1 = aux;
        }

        int suma = 0;

        for(int i = num1; i <= num2; i++){
            suma += i;
        }

        System.out.println("La suma de los números comprendidos entre " + num1 + " y " + num2 + " es igual a " + suma);
    }
}
