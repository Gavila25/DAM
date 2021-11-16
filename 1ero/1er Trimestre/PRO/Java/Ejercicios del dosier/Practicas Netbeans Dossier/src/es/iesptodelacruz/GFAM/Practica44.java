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
public class Practica44 {
    public static void main(String[] args) {
        
        System.out.println("Introduce un número entre 1 y 20");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        
        for(int i=1; i<6; i++){
            System.out.println(num+" ^ "+ i +" = "+ (int)Math.pow(num,i));
        }
        
    }
}
