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
public class Practica37 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        int cantidadTotal=0;
        
        System.out.println("¿Cuantos billetes tienes de 500?");
        int billetes500=sc.nextInt();sc.nextLine();
        cantidadTotal+=(billetes500*500);
        System.out.println("¿Cuantos billetes tienes de 200");
        int billetes200=sc.nextInt();sc.nextLine();
        cantidadTotal+=(billetes200*200);
        System.out.println("¿Cuantos billetes tienes de 100");
        int billetes100=sc.nextInt();sc.nextLine();
        cantidadTotal+=(billetes100*100);
        System.out.println("¿Cuantos billetes tienes de 50");
        int billetes50=sc.nextInt();sc.nextLine();
        cantidadTotal += (billetes500 * 50);
        System.out.println("¿Cuantos billetes tienes de 20");
        int billetes20=sc.nextInt();sc.nextLine();
        cantidadTotal+=(billetes20*20);
        System.out.println("¿Cuantos billetes tienes de 10");
        int billetes10=sc.nextInt();sc.nextLine();
        cantidadTotal += (billetes10 * 10);
        System.out.println("¿Cuantos billetes tienes de 5");
        int billetes5=sc.nextInt();sc.nextLine();
        cantidadTotal += (billetes5 * 5);
        
        System.out.println("Su saldo total es de " + cantidadTotal);
 
        }
    }

