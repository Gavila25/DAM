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
public class Practica8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("De cuanto quieres tu array");
        int sizeArray=sc.nextInt();
        int []array;
        int num;
        array=new int[sizeArray];
        for(int i=0; i<sizeArray; i++){
            System.out.println("Introduce un número");
            num=sc.nextInt();sc.nextLine();
            array[i]=num;
        }
        
        for(int i=0; i<sizeArray; i++){
         System.out.println("["+i+"]"+"= "+array[i]);
        }
        
    }
}
