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
public class Practica33BucleDoWhile {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int codigoSecreto=1234;
        int i=2;
        do{
          System.out.println("Introduzca una clave");
          int pin=sc.nextInt();sc.nextLine();
          if(pin!=codigoSecreto){
              System.out.println("Pin Incorrecto. Intentos restantes = "+ (i));
          } 
          if(pin==codigoSecreto){
              System.out.println("Pin Correcto. Bienvenido");
              i=0;
          }
          i--;
        }while(i>=0);
        
    }
}
