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
public class PracticaAdicionalMCDyMCM {
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
     
       public static void mostrarmenu(){
            System.out.println("\tMenú");
            System.out.println("Calculadora de MCD y MCM");
            System.out.println("1. MCD");
            System.out.println("2. MCM");
            System.out.println("3. Salir");
}
       public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int opcion;
        int num1=0, num2=0;
        do{
          mostrarmenu();
          opcion=sc.nextInt();sc.nextLine();
          if(opcion>3 ||opcion<1){
              System.out.println("Opción invalida. Vuelva a intentarlo");
              opcion=sc.nextInt();sc.nextLine();
          }
         
        }while(opcion<3 && opcion <1);
        
         if (opcion<3){
            System.out.println("Dame el primer número");
            num1=sc.nextInt();
            System.out.println("Dame el segundo número");
            num2=sc.nextInt();
        }
         
        switch(opcion){
            case 1:
                System.out.println("El resultado del MCD es: "+mcd(num1,num2));
                break;
            case 2:
                System.out.println("El resultado del MCM es: "+mcm(num1,num2));
                break;
            case 3:
                System.out.println("Sistema finalizado. Hasta luego");
                break;
           
        }
    }
}
