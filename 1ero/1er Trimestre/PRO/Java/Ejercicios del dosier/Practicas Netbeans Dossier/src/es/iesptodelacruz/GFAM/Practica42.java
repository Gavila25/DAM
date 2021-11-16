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
public class Practica42 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int totalHoras = 0;
        
        System.out.println("Introduzca el pago por el encargo");
        int pago = sc.nextInt();
        
        System.out.println("Introduzca el número de miembros del trabajo");
        int miembros = sc.nextInt();
        
        for( int i = 1; i <= miembros; i++){
            System.out.println("Cuantas horas trabaja el " + i + " miembro");
            int horas = sc.nextInt();
            totalHoras += horas;
        }
        
        System.out.println("Han trabajado un total de " + totalHoras + " horas");
        int valorHora = pago / totalHoras;
        
        System.out.println("El valor de la hora es de " + valorHora + "€");
        
        
        
       
                
    }
}
