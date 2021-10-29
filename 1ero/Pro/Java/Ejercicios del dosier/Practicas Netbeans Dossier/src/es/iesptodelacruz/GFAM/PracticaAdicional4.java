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
public class PracticaAdicional4 {
    public static void main(String[] args) {
        
        System.out.println("¿Cuantas horas laborales realizo esta semana?");
        Scanner sc=new Scanner(System.in);
        double horaTrabajadas=sc.nextDouble();
        
        System.out.println("¿A cuanto están pagando la hora?");
        double precioHora;
        precioHora=sc.nextDouble();
        
        System.out.println("Tu sueldo semanal es:"+ (horaTrabajadas*precioHora));
        
    }
}
