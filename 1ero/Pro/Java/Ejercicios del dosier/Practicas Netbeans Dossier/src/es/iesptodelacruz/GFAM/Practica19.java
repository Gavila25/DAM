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
public class Practica19 {
    public static void main(String[] args) {
        
        System.out.println("Temperatura en Farenheit");
        Scanner sc=new Scanner(System.in);
        int tempFarenheit=sc.nextInt();
        
        double tempCentigrados= ((double)tempFarenheit - 32.0) * 5/9;
        System.out.println ("Tu temperatura es " + tempCentigrados);
        
    }
}
