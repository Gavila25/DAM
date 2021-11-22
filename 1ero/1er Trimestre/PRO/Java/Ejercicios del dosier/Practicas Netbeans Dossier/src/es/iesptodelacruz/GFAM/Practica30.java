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
public class Practica30 {
    public static void main (String[] args){
       
       Scanner sc=new Scanner(System.in);
        do{
            
        int numAleatorio=(int)(Math.random()*(20-10+1)+10);
        
        System.out.println("Tu número es: "+numAleatorio);
        System.out.println("Presiona C ó c si desea continuar");
        
    }while(sc.nextLine().toLowerCase().charAt(0)=='c');
            
}
   } 