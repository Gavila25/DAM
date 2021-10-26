/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cacharreo;

import java.util.Scanner;

/**
 *
 * @author Guillermo Avila Martín
 */
public class Cacharreo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
     System.out.println("Que tipo de Forma Geométrica desea realizar"
        +" \nCuadrado\t 1" 
        +" \nRectángulo\t 2" 
        +" \nRombo\t\t 3"
        +" \nRomboide\t 4" 
        +" \nTrapecio\t 5" 
        +" \nPentagono\t 6" 
        +" \nCirculo \t 7" 
        +" \nTriangulo\t 8");
      Scanner sc=new Scanner(System.in);
      int start= sc.nextInt();
      
    if (start==1) {
     //Calcular el area de un cuadrado
     System.out.println ("Escribir el valor del lado 1");
        double lado1=sc.nextDouble();
    
     System.out.println ("Escribir el valor del lado 2");
        double lado2=sc.nextDouble();
    
        double area=lado1*lado2;
    System.out.println("El área del cuadrado es: " + area);
    
    }if (start==2) {
    //Calcular el area del rectángulo
    System.out.println ("Escribe el valor de la base");
    double base=sc.nextDouble();
  
     System.out.println ("Escribe el valor de la altura");
    double altura=sc.nextDouble();
  
    double areaRectangulo=base*altura;
    System.out.println("El área del Rectángulo es: " +areaRectangulo);
    
    }if (start==3) {
    //Calcular el area del Rombo
    System.out.println ("Escribe el valor de la primera diagona l");
    double d1=sc.nextDouble();
  
    System.out.println ("Escribe el valor de la diagona 2");
    double d2=sc.nextDouble();
  
    double areaRombo=(d1*d2)/2;
    System.out.println("El área del Rombo es: " +areaRombo);
    
    }if (start==4) {
     //Calcular el area del Romboide
     System.out.println ("Escribe el valor de la base");
     double base=sc.nextDouble();

        System.out.println ("Escribe el valor de la altura");
    
        double altura=sc.nextDouble();

        double areaRomboide=base*altura;
        System.out.println("El área del Romboide es: " +areaRomboide);
    
   }if (start==5) {
      //Calcular el área del Trapecio
    System.out.println ("Escribe el valor de la base Mayor");
        double baseM= sc.nextDouble();

        System.out.println ("Escribe el valor de la base Menor");
        double baseMe= sc.nextDouble();

        System.out.println ("Escribe el valor de la altura");
        double altura=sc.nextDouble();

        double areaTrapecio=(baseM*baseMe)*altura/2;
        System.out.println("El área del Trapecio es:"+ areaTrapecio);
        
   }if (start==6) {
     //Calcular el área del Pentágono  
       System.out.println ("Escribe el valor del lado");
       double lado=sc.nextDouble();
       
       System.out.println("Escribe el valor de la Apotema");
       double apo=sc.nextDouble();
       
       double areaPentagono= (lado*apo)/2;
       System.out.println("El área del Pentágono es: "+ areaPentagono);
       
   }if (start==7) {
      //Calcular el área del Circulo
      System.out.println("Escribe el valor del Radio");
      double radio=sc.nextDouble();
      
      final double PI = 3.141591;
      
      double areaCirculo= PI * (radio*radio);
      
      System.out.println("El área del Circulo es: " + areaCirculo);
      
   }if (start==8){
     //Calcular el área del Triángulo
     System.out.println ("Escribe el valor de la base");
     double base=sc.nextDouble();
     
     System.out.println ("Escrible el valor de la altura");
     double altura=sc.nextDouble();
     
     double areaTriangulo= (base*altura)/2;
     System.out.println ("El área del Triángulo es: "+ areaTriangulo);
       
   }
   
 }
    }