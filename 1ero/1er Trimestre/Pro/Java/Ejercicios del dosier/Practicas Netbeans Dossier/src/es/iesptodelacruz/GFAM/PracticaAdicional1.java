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
public class PracticaAdicional1 {
    public static void main(String[] args) {
        
         Scanner sc= new Scanner(System.in);
         System.out.println("Introduce un número para calcular el IVA");
         final double IVA=0.21;
         double numero = sc.nextDouble();
        
         double numeroConIva;
         numeroConIva = numero+numero*IVA;
         System.out.println("El IVA de tu producto es:"+ numeroConIva);
         
    }
}
