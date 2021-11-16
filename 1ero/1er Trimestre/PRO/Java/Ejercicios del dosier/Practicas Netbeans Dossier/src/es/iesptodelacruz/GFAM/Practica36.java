/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.iesptodelacruz.GFAM;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Practica36 {
    public static void main(String[] args) {
        
        Random rnd= new Random();
        int sumaTotal=0;
        
        Scanner sc= new Scanner(System.in);
        boolean continuar=true;
        
        while(continuar==true){
            int dado1=rnd.nextInt(6)+1;
            sumaTotal+=dado1;
            int dado2=rnd.nextInt(6)+1;
            sumaTotal+=dado2;
            int dado3=rnd.nextInt(6)+1;
            sumaTotal+=dado3;
            System.out.println("El resultado de tu tirada es : "+ sumaTotal);
            System.out.println("¿Desea continuar?");
            System.out.println("Pulsa f si quieres acabar");
            if(sc.nextLine().toLowerCase().charAt(0) !='f'){
                continuar=false;
            }
        }
        
        
        
        
        
            
        

    }
}
