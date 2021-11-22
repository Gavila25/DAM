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
public class Practica33BucleWhile {
    public static void main(String[] args) {
        
        //Este sería el primer intento para introducir la clave
        System.out.println("Introduzca una clave");
        Scanner sc=new Scanner(System.in);
        int pin=sc.nextInt();sc.nextLine();
        int codigoSecreto=1234;
        int i=2;
        boolean continuar=true;
        //Aquí se entra en el bucle donde realizamos los ultimos dos intentos
        while (continuar){
           System.out.println("Código Incorrecto. Intentos restantes = "+(i));
            System.out.println("Introduzca una clave");
            pin=sc.nextInt();sc.nextLine(); 
            i--;
            //Si nos quedamos sin intentos el programa entrá en este if y para.
            if(i==0){
                continuar=false;
            }
             if (pin==codigoSecreto){
             System.out.println("Código Correcto. Bienvenido");
             continuar=false;
         }
        //Si el usuario acierta el pin, entrará aquí y se apagará el programa
       
  
    }
  }   
}