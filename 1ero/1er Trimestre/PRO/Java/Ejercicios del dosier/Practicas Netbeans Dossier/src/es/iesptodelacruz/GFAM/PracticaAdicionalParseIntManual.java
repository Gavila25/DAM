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
public class PracticaAdicionalParseIntManual {
    public static void main(String[] args) {
        
        System.out.println("Dame un númer entero");
        Scanner sc=new Scanner(System.in);
        
        String strNumero;
        strNumero=sc.nextLine();
        int i=0;
        int sizeNumero=strNumero.length();
        int sumaTotal=0;
        
        while(i<sizeNumero){
            int digito=strNumero.charAt(i) - '0';
            int sumando=digito * (int)Math.pow(10,sizeNumero -i -1);
            
            sumaTotal+= sumando;
            i++;
        }
        System.out.println(sumaTotal);
        
    }
}
