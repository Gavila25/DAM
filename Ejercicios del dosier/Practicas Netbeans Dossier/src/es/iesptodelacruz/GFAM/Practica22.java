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
public class Practica22 {
    public static void main(String[] args) {
        
        System.out.println("Dame un número entero");
        Scanner sc=new Scanner(System.in);
        
        int num=sc.nextInt();
        
        if (num<0)
            System.out.println("El número " + num + " es menor que 0" );
        else if (num==0)
            System.out.println("El número " + num + " es igual a 0");
        else if ((num>=0) && (num<=10))
            System.out.println("El número " + num + " es mayor que 0 y menor que 10");
        else if (num==10)
            System.out.println("El número " + num + " es igual a 10");
        else if ((num>=10) && (num<=20))
            System.out.println("El número " + num + " es mayor que 10 y menor que 20");
        else if (num>=20)
            System.out.println ("El número " + num+ " es mayor o igual a 20");
        
    }
}
