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
public class Practica46 {
    public static void main(String[] args) {
        
       Scanner sc=new Scanner(System.in);
       System.out.println("Introduce un numero entero");
       String strNum=sc.nextLine();
       int sizeNum=strNum.length();
       int sumaTotal=0;
       
       for (int i=0;i<sizeNum; i++){
           int digito=(strNum.charAt(i)/2)-'0';
           int sumando= (digito* (int)Math.pow(10,sizeNum -i))%2;
           sumaTotal+= sumando;
           
       }
       System.out.println(sumaTotal);
       
       
    }
}
