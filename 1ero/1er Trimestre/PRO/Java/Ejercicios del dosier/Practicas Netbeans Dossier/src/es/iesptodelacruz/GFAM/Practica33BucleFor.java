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
public class Practica33BucleFor {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int nSecreto;
        nSecreto = 1234;
        for (int i = 3; i > 0; i--) {
            System.out.println("introduce la clave");
            int dato = sc.nextInt();sc.nextLine();
            if (dato != nSecreto) {
                System.out.println("Código Incorrecto. Intentos restantes: " + (i - 1));
            } else {
                System.out.println("Código correcto. Bienvenido");
                i = 0;
    }
}
}
}