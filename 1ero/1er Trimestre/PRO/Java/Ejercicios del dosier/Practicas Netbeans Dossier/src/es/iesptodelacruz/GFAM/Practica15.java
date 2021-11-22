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
public class Practica15 {
    public static void main(String[] args) {
        
        System.out.println("Dime tu altura en M, para calcular el indice de masa corporal");
        Scanner sc=new Scanner(System.in);
        double altura=sc.nextDouble();
                
        System.out.println("Dime tu peso en KG");
        double peso=sc.nextDouble();
        
        double imc=(peso/(altura*altura));
        System.out.println("Tu Índice de Masa Corporal es: "+imc);
        
    }
}
