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
public class Practica39 {
    public static void main(String[] args) {
        
        System.out.println("Introduzca un número entero");
        Scanner sc=new Scanner(System.in);
        
        int num=sc.nextInt();
        int numInvertido;
        if(num>=10 && num <=99){
            int resto=num%10;
            int cociente=num/10;
            numInvertido=resto*10+cociente;
            System.out.println(numInvertido);
            
        }else{
           boolean infoMal= true;
        while(infoMal){
            System.out.println("Número Incorrecto. Tiene que ser número >=10 y <=99");
            num=sc.nextInt();
            if(num>=10 && num<=99){
                infoMal=false;
            int resto=num%10;
            int cociente=num/10;
            numInvertido=resto*10+cociente;
            System.out.println(numInvertido);
            }
        } 
        }
        
    }
  }