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
public class Practica40 {
    public static void main(String[] args) {
        
        System.out.println("Dame un numero entero entre 0 y 999");
        Scanner sc=new Scanner(System.in);
        String texto=sc.nextLine();
        System.out.println(texto.length());
    }
}
