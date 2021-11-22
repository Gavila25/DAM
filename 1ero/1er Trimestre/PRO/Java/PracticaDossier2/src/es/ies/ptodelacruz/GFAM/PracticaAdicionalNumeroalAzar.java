/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.ies.ptodelacruz.GFAM;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class PracticaAdicionalNumeroalAzar {
    public static int mostrarAzar(int limInf, int limSup){
        Random rnd=new Random();
        int numAleatorio=rnd.nextInt(limInf - limSup - 1) + limSup + 1;
        return numAleatorio;
        
  }
    
    public static void main(String[] args) {
        int num1, num2;
        //De aquí sacamos la cantidad de numeros que queremos
        Scanner sc=new Scanner(System.in);
        System.out.println("¿Cuántos números aleatorios quieres?");
        int cantidadNum=sc.nextInt();sc.nextLine();
        System.out.println("Introduce el primer número");
        num1=sc.nextInt();sc.nextLine();
        System.out.println("Introduce el segundo número");
        num2=sc.nextInt();sc.nextLine();
        //comprobamos cual es el mayor y el menor
        int temp=0;
        if (num2>num1){
            temp=num1;
            num1=num2;
            num2=temp;
        }
        //aquí enviamos los numeros al metodo
        
        int numAleatorio=mostrarAzar(num1,num2);
        for (int i=0; i<cantidadNum; i++){
            System.out.println(numAleatorio);
            
        }
    }
}
