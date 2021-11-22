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
public class Practica24 {
    public static void main(String[] args) {
        
        System.out.println("¿Qué idioma hablas?");
        Scanner sc=new Scanner(System.in);
        System.out.println("Castellano = c\n"
        +"Inglés = i\n"
        +"Francés = f");
        char letra=sc.nextLine().toLowerCase().charAt(0);
        
        switch(letra){
            case 'c': System.out.println("Buenos Días");
            break;
            case 'i': System.out.println("Good Morning");
            break;
            case 'f': System.out.println("Bonjour");
            break;
            default: System.out.println("No entiendo tú idioma");
            break;
        }
    }
}