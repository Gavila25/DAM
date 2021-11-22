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
public class Practica23 {
    public static void main(String[] args) {
        
        System.out.println("Dame el valor de a");
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        if (a==0){
            System.out.println("El valor de a no puede ser igual a 0");
        }else{
        System.out.println("Dame el valor de b");
        double b=sc.nextDouble();
        System.out.println("Dame el valor de c");
        double c=sc.nextDouble();
        double numRaiz=(b*b-4*a*c);
        
        if (numRaiz<0){
            System.out.println("No hay solución real");
        }else{
            double raiz=Math.sqrt(numRaiz);
            double ecuacion=(-b+raiz)/(2*a);
            double ecuacionN=(-b-raiz)/(2*a);
            System.out.println("El resultado de la ecuación "+ ecuacion);
            System.out.println("El resultado de la ecuación "+ecuacionN);
        }
        
    }
}
}