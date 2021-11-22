/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.iesptodelacruz.GFAM;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Practica43 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        Random rnd=new Random();
        
        int numAleatorio=rnd.nextInt(99);
        
        System.out.println("Introduzca su respuesta");
        int respuesta=sc.nextInt();
        int i=0;

        //Saber si la respuesta es correcta o no
        
        while(respuesta!=numAleatorio){
          System.out.println("Respuesta incorrecta");
          //se compara si es menor o mayor y con eso entra al if donde me pide otro valor para volver al bucle
          boolean menor= respuesta<numAleatorio;
          boolean mayor= respuesta>numAleatorio;
        if(menor==true){
            System.out.println("Tu respuesta está por debajo del número");
            respuesta=sc.nextInt();
            i++;
        }
        if(mayor==true){
            System.out.println("Tu respuesta está por encima del número");
            respuesta=sc.nextInt();
            i++;
           
        }
         if (respuesta==numAleatorio){
            System.out.println("Respuesta Correcta. Tardaste "+ i + " intentos en acertar");
        } 
         }  
        
        
        
        
        
        
        
        
    }
}