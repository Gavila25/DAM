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
public class PracticaAdicionalPractica19 {
    public static void main(String[] args) {
        
        System.out.println("Menú:");
        System.out.println("1. Pasar de Farenheit a celcius");
        System.out.println("2. Pasar de celcius a Farenheit");
        Scanner sc=new Scanner(System.in);
        int opcion=sc.nextInt(); sc.nextLine();
        if (opcion==1){
            System.out.println("Dame los Farenheit");
            int farenheit=sc.nextInt();
            double centigrados= (farenheit - 32)*5/9.0;
            System.out.println("Tus grados en celcius son "+centigrados);
        }else{
            System.out.println("Dame los celcius");
            int centigrados=sc.nextInt();
            double farenheit=(centigrados* 9/5)+32;
            System.out.println("Tus grados en Farenheit son "+farenheit);
            
            
        }
   }
}
