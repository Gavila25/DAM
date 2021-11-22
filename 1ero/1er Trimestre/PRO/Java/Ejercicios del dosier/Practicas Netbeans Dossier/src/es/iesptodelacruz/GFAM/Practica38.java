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
public class Practica38 {
    public static void main(String[] args) {
        
        System.out.println("Introduzca una cantidad de horas");
        Scanner sc=new Scanner(System.in);
        double hora=sc.nextDouble();sc.nextLine();
        
        double dDias=hora/24;
        
        //Dias -- /24; horas--60; minutos--60; segundos--60;
        
        int dias=(int)dDias;
        double dhoras = (dDias - dias)*24;
        int horas=(int)dhoras;
        double dMinutos= (dhoras-horas)*60;
        int minutos=(int)dMinutos;
        double dSegundos=(dMinutos-minutos)*60;
        int segundos=(int)dSegundos;
        
        System.out.println("Tienes "+dias +" Días "+ horas +" Horas "+ minutos+ " Minutos "+segundos+" Segundos"  );
        
        
    }
}
