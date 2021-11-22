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
public class Practica28 {
    public static void main(String[] args) {
        
        int num=1;
        int sumaPositiva = 0, sumaNegativa=0;
        
        while(num!=0){
            System.out.println("Introduzca un número entero");
            Scanner sc=new Scanner(System.in);
            num=sc.nextInt();
            
        }
        if(num>0){
            sumaPositiva= num;
            
        }else{
            sumaNegativa= num;
        }
        System.out.println("Las sumas son: "+ sumaNegativa+ " y "+ sumaPositiva);
    }
    
}
