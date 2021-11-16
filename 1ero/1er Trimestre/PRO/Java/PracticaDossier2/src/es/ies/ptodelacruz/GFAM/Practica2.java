/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.ies.ptodelacruz.GFAM;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Practica2 {
        public static int mcd(int num1, int num2){
      int resultado=1;
      int dividendo=num1;
      int divisor=num2;
      int resto;
      do{
          resto=dividendo%divisor;
          resultado=divisor;
          dividendo=divisor;
          divisor=resto;
      }while(resto!=0);
          
      
      return resultado;
  }
    public static int mcm(int num1,int num2){
       int resultadomcm=1;
       resultadomcm=num1*num2/(mcd(num1,num2));
      return resultadomcm;
    }
    
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int opcion=0;
       int num1=0, num2=0;
       int temp=0;
       
        System.out.println("Introduce el primer número");
        num1=sc.nextInt();sc.nextLine();
        System.out.println("Introduce el segundo número");
        num2=sc.nextInt();sc.nextLine();
        
        if(num2>num1){
            temp=num1;
            num1=num2;
            num2=temp;
        }
        
        int resultado=mcd(num1,num2);
        System.out.println("El MCM de "+num1+" y "+num2+" es: "+mcm(num1,num2));
       
    }
 }

