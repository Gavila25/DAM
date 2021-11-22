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
public class Practica9 {
    public static int aleatorio(int limInf, int limSup){
        //Con este metodo generamos los numeros aleatorios
        Random rnd=new Random();
        int num=rnd.nextInt(limSup - limInf - 1) + limInf + 1;
        return num;
    }
    
    public static void main(String[] args) {
        int []array;
        int size=10;
        int num;
        array= new int[size];
        //rellenamos el array con esos numeros ya generados
        for(int i=0; i<size;i++){
             num=aleatorio(1,50);
             array[i]=num*2;
        }
        //con esto mostramos las posiciones del array y su numero
        for(int i=0; i<size;i++){
             System.out.println("["+i+"]= "+array[i]);
        }
        
    }
    
}  

