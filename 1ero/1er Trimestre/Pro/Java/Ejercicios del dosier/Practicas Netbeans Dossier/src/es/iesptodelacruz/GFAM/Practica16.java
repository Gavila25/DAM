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
public class Practica16 {
    public static void main(String[] args) {
        
        System.out.println("Introduzca la base del rectángulo en cm");
        Scanner sc= new Scanner (System.in);
        double baseEnCm;
        baseEnCm= sc.nextDouble();sc.nextLine();
        double baseEnM= baseEnCm/100.0;
        
        System.out.println("Introduzca la altura del rectángulo en cm");
        double alturaEnCm;
        alturaEnCm=sc.nextDouble();sc.nextLine();
        double alturaEnM= alturaEnCm/100.0;
        
        double areaEnCm= (baseEnCm)*(alturaEnCm);
        double areaEnM= (baseEnM)*(alturaEnM);
        
        System.out.println("El área de tu rectángulo en CM es:"+ areaEnCm + "cm²");
        System.out.println("El área de tu rectángulo en M es:"+ areaEnM + "m²");
        
        
        
    }
}
