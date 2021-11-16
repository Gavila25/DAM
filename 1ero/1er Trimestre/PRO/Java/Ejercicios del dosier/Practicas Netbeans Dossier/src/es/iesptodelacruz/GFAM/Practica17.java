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
public class Practica17 {
    public static void main(String[] args) {
        
        System.out.println("Dame el precio del producto");
        Scanner sc=new Scanner(System.in);
        double precio=sc.nextDouble();
        
        double IGIC=0.07;
        
        System.out.println("El impuesto de tu producto es ="+(precio+IGIC));
        
    }
}
