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
public class Practica25 {
    public static void main(String[] args) {
        
        System.out.println("Escribe una letra");
        Scanner sc=new Scanner(System.in);
        char letra=sc.nextLine().toLowerCase().charAt(0);
        
        switch (letra){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u': System.out.println("Es una vocal");
            break;
            default: System.out.println("No es una vocal");
            break;
        }
    }
}
