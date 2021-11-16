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
public class PracticaAdicionalPin {
    public static void main(String[] args) {
        
        System.out.println("Introducir el pin de 4 dígitos");
        Scanner sc=new Scanner(System.in);
        int secreto=2345;
        int pin;
        
        boolean pinAcertado=false;
        
        for(int i=3; i>0 && !pinAcertado;i--){ //Esto es los 3 intentos del pin
            int multiplicador=1000;
            int posiblePin=0;
            for(int k=4; k>0;k--){//estamos componiendo el pin digito a digito
                System.out.println("Introduzca el "+ (5-k)+" dígito");
                int digito=sc.nextInt();sc.nextLine();
                if(digito>=0 && digito<=9){
                    int dato=digito*multiplicador;
                    posiblePin+=dato;
                    multiplicador/=10;
                }else{
                    System.out.println("El sistema no acepta este digito.\n"
                    +"Vuelva a repetirlo");
                    k++;
                }
                
                
            }
            pinAcertado = posiblePin == secreto;
        }
        
        if(pinAcertado){
            System.out.println("Pin correcto.Puedes Pasar");
        }else{
            System.out.println("Pin incorrecto. Pruebe otra vez");
        }
    }
}
