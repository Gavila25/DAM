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
public class Practica4 {
    public static boolean numeroValido(int num){
      return num>=20 && num<=50 && num%3==0;
    }
    public static void main(String[] args) {
       int num;
       Scanner sc = new Scanner(System.in);
       do{
           System.out.println("Introducir un número: ");
           num = sc.nextInt();
       }while(!numeroValido(num));
       System.out.println("El número cumple los requisitos. Se puede continuar");
       
    }
}
