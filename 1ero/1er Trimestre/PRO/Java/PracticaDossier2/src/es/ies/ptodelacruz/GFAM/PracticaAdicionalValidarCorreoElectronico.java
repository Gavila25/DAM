/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.ies.ptodelacruz.GFAM;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class PracticaAdicionalValidarCorreoElectronico {
    
    public static boolean correoValido(String correo){
        boolean mailValido;
        boolean incluyeArroba=false;
        
        boolean incluyepunto = false;
        int i;
        
            for (i=0; i<correo.length() && incluyeArroba == false; i++){
                char c=correo.charAt(i);
                
             if(c=='@'){
              incluyeArroba=true;
                }
            }

            if(incluyeArroba){
                boolean noHaySegundoArroba = true;
                for ( ; i<correo.length() && noHaySegundoArroba;i++){
                    char c=correo.charAt(i);
                    if(c=='@'){
                     noHaySegundoArroba=false;   
                    }
                }
                 if(noHaySegundoArroba==false){
                   mailValido = false;
            }
          
            }
            return mailValido=true;
        }
    
    public static void main(String[] args) {
        boolean mailValido= false;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce un correo electrónico");
        String correo=sc.nextLine();
        
        if(mailValido==true){
            System.out.println("Correo Valido");
        }
       
        
    }
}
