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
public class PracticaCalculadora {
    public static void mostrarMenu(){
        System.out.println("Menú");
        System.out.println("1: Suma");
        System.out.println("2: Resta");
        System.out.println("3: Múltiplicar");
        System.out.println("4: Dividir");
        System.out.println("5: Salir");
        
    }
    public static double suma(double sumando1, double sumando2){
    double resultado= sumando1+sumando2;
    return resultado;
}
    public static double resta(double num1, double num2){
    double resultado= num1-num2;
    return resultado;
   } 
    public static double multiplicacion(double multiplicando1, double multiplicando2){
    double resultado= multiplicando1*multiplicando2;
    return resultado;
   }
    
    public static double dividir(double dividendo, double divisor){
    double resultado= dividendo/divisor;
    return resultado;
   }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int opcion = 0;
        double num1=0, num2=0;
        
        while(opcion!=5){
            do {
                mostrarMenu();
                opcion=sc.nextInt();sc.nextLine();
            if(opcion >5 || opcion <1){
                System.out.println("Opción equivocada. Usé una de las opciones asignadas");
                System.out.println("");
            }
        }while(opcion >5 && opcion <1);
        
         if(opcion<5 && opcion>=1){
                System.out.println("Dame el primer número");
                num1=sc.nextDouble();sc.nextLine();
                System.out.println("Dame el segundo número");
                num2=sc.nextDouble();sc.nextLine();
                System.out.println("");
        }
         
        double resultado=0;
        switch(opcion){
            case 1:
                resultado=suma(num1,num2); 
                System.out.println("El resultado de la suma es: "+resultado+"\n");
                break;
                
            case 2:
                resultado=resta(num1,num2); 
                System.out.println("El resultado de la resta es: "+resultado+"\n");
                break;
                
            case 3:
                resultado=multiplicacion(num1,num2);
                System.out.println("El resultado de la multiplicación es: "+resultado+"\n");
                break;
                
            case 4:
                resultado=dividir(num1,num2);
                System.out.println("El resultado de la división es: "+resultado+"\n");
                break;
                
            case 5:
                System.out.println("Usted ha decidido apagar el programa. Hasta luego");
                break;
        }
      
        }   
    }
}
