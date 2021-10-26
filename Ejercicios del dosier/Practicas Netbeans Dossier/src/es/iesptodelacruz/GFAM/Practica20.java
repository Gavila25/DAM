/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.iesptodelacruz.GFAM;

import java.util.Scanner;

/**
 *
 * @author Guillermo Avila Martín
 */
public class Practica20 {
    public static void main(String[] args) {
        
        System.out.println("Dame un Numero entero para saber si es par o impar");
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        
        if (num%2==0)
            System.out.println("El número es Par");
                else{
            System.out.println("El número es Impar");    
                }
    }
}
