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
public class Practica18 {
    public static void main(String[] args) {
        
        System.out.println("¿Cuantas horas laborales realizo esta semana?");
        Scanner sc=new Scanner(System.in);
        double horaLaborales= sc.nextDouble();
        
        double precioHora=18;
        
        System.out.println("Tu sueldo a la semana será " +(horaLaborales*precioHora));
    }
}
