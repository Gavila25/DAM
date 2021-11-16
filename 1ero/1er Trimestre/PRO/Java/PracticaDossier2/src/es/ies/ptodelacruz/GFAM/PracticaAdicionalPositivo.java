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
public class PracticaAdicionalPositivo {
    public static int numAleatorio(){
        Random rnd=new Random();
        int num=rnd.nextInt(24);
        return num;
    }
    
    public static void main(String[] args) {
        String []alumno={"Guillermo","Cristian Cantelar",
            "Wennui Chen","Alfonso","David","Samuel",
            "Raúl","Damián","Alberto","Alvaro","Yared",
            "Ricardo","Melchor","Nathan","Christian Novo",
            "Patricia","Airam","Ángel","Alejandro Pérez",
            "Nauzet","Adrian Regalado","Emmanuel",
            "Alejandro Torres","Alejandro Toste"};
        int num=numAleatorio();
        System.out.println(alumno[num]);
    }
}
