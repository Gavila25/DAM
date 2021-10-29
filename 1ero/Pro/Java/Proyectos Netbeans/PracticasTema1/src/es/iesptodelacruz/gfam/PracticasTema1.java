/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.iesptodelacruz.gfam;

/**
 *
 * @author alumno
 */
public class PracticasTema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Hola mundo");
        
        int numero1;
        numero1=5;
        
        int numero2;
        numero2=7;
        
        System.out.println(numero1*numero2);
        
        for (int i=97; i<= 'z'; i++){
            
            System.out.println((char)i);
        }
        
        char letra='a';
        int letraComoInt= (int)letra;
        System.out.println(letraComoInt);
        
        System.out.println(System.currentTimeMillis());
        
        System.out.println(1234==1234L);
        
       
        System.out.println(067);
        
        System.out.println("Pulsa \"C\" para continuar");
        
        char comilla='"';
        
        System.out.println("Pulsa"+ comilla + "C" + comilla + "para continuar");
    }
    
}
