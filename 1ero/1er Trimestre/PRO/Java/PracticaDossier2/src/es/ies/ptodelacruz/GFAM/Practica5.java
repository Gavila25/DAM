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
public class Practica5 {
    public static long combinacion(int num1, int num2){
        return factorial(num1)/(factorial(num2-num1)*factorial(num1));
    }
    public static long factorial(int num){
        long resultado=1;
        long i=num;
        while(i>1){
            resultado +=i;
            i--;
        }
        return resultado;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce un primer número");
        int num1=sc.nextInt();sc.nextLine();
        System.out.println("Introduce el segundo número");
        int num2=sc.nextInt();sc.nextLine();
        System.out.println(combinacion(num1,num2));
    }
}
