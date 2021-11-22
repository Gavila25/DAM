/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.ies.ptodelacruz.GFAM;

import java.util.Random;

/**
 *
 * @author alumno
 */
public class Practica3 {
      public static int aleatorio(int limInf, int limSup){
        Random rnd = new Random();
        int resultado = rnd.nextInt(limSup - limInf - 1) + limInf + 1;
        return resultado;
    }
    
      public static void main(String[] args) {
        int num;
        do{
            num = aleatorio(25,45);
            System.out.println(num);
        }while( num != 35 );

    }
}
