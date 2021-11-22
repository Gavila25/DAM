/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.ies.ptodelacruz.GFAM;


import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class PracticaDeClaseNumerosPremiadosGuillermoCorrecto {
    public static int aleatorio(int limInf, int limSup){
        Random rnd=new Random();
        int numPremio=rnd.nextInt(limSup - limInf - 1) + limInf + 1;
        return numPremio;
    }
    
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean continuar = false;
        //Pedimos cuantos números juega
        System.out.println("Lotería del 10 al 30");
        System.out.println("¿Cuantos números de loteria quieres?");
        int sizeArray=sc.nextInt();
        int num;
        int precioLoteria=10;
        int []array;
        int []arrayPremio;
        int numPremio;
        array = new int[sizeArray];
        arrayPremio=new int[5];
        //Guardamos esos números
        do{
           for (int i=0; i<sizeArray; i++){
        System.out.println("¿Índica el número que quieres?");
            num=sc.nextInt();sc.nextLine();
            array[i]=num;
            
        }
        //generamos los números aleatorios
       for(int i=0; i<4; i++){
            numPremio=aleatorio(10,30);
            arrayPremio[i]=numPremio;
       }
       //con esto recorremos el array con los números guardados
       int j=0;
        for(int i=0; i<sizeArray; i++){
            if(array[i]==arrayPremio[j]){
                System.out.println("Tu número "+array[i]+" ha salido premiado");
            }else if(array[i]!=arrayPremio[i]){
                System.out.println("Tu número "+array[i]+" no ha salido premiado");
            }
            precioLoteria+=precioLoteria;
            System.out.println("Has gastado "+precioLoteria+" euros");
            
        }  
        //  Es menos complicado de entender al usuario pulsar la C para continuar que tener que poner el -1
            System.out.println("Si quiere volver a jugar introduzca C");
            if(sc.nextLine().toLowerCase().charAt(0)=='c'){
            continuar=true;
        }
        }while(continuar==true);
        
       }
        
    }

