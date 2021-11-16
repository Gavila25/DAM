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
public class Practica11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("¿Cuántos números quieres introducir?");
        int size=sc.nextInt();sc.nextLine();
        int array[];
        array=new int[size];
        int numTotal=0;
        for(int i=0; i<size; i++){
            System.out.println("Introduce un número");
            int num=sc.nextInt();sc.nextLine();
            numTotal+=num;
            array[i]=num;
        }
        
        for(int i=0; i<size; i++){
            System.out.println("["+i+"]= "+array[i]);
        }
        int media=numTotal/size;
        double varianza=0;
        double elevado=0;
        for(int i=0; i<size;i++){
            elevado=Math.pow((array[i]-media),2);
            varianza+=elevado;
        }
        double varianzaTotal=varianza/size;
        System.out.println("La media de los números introducidos es: "+media+"\n"+
                "La varianza de los números es: "+varianzaTotal);
    }
    
}
