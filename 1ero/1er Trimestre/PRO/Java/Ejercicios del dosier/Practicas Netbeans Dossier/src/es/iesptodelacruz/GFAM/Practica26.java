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
public class Practica26 {
    public static void main(String[] args) {
        
        System.out.println("Dime un día de la semana\n"
        +"lunes\t\t1\n"
        +"Martes\t\t2\n"
        +"Miércoles\t3\n"
        +"Jueves\t\t4\n"
        +"Viernes\t\t5\n");
        Scanner sc=new Scanner(System.in);
        int dia=sc.nextInt();
        
        switch(dia){
            case 1: System.out.println("El lunes toca FOL a primera");
            break;
            case 2: System.out.println("El martes toca Sistemas a primera");
            break;
            case 3: System.out.println("El miércoles toca Fol a primera");
            break;
            case 4: System.out.println("El jueves toca Inglés a primera");
            break;
            case 5: System.out.println("El viernes toca Inglés a primera");
            break;
        }
       
    }
}
