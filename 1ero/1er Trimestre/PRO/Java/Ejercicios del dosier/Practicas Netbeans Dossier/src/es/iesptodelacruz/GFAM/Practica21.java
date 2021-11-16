/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.iesptodelacruz.GFAM;

import java.util.Scanner;

/**
 *
 * @author Guillermo Avila Martín
 */
public class Practica21 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un número entero para saber si es múltiplo de 3 o de 5");
        int num = sc.nextInt();

        if (num % 3 == 0) {
            System.out.println("Tu número es múltiplo de 3");
            if (num % 5 == 0) {
                System.out.println("" +"Y tu número es múltiplo de 5");
            } else {
                System.out.println("" + "Pero no de 5");
            }
        } else {
            System.out.println(""+ "Tu número no es múltiplo de 3");
            if (num % 5 == 0) {
                System.out.println("" + "Pero sí es múltiplo de 5");
            } else {
                System.out.println("" + "Ni de 5");
            }
        }

    }

}
         
      
                
    
 