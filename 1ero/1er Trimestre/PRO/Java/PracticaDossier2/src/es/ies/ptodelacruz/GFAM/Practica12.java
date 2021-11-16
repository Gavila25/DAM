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
public class Practica12 {
    /**
     * Este metodo calcula los numeros aleatorios y los mete en el array
     * @param cant la cantidad de numeros que tenemos que generar
     * @param min el minimo del rango de los numeros generados
     * @param max el maximo del rango de los numeros generados
     * @return 
     */
    public static int[] arrayAleatorio(int cant, int min, int max){
        int array[]=new int [cant];
        int rango=max-min +1;
        for(int i=0; i<array.length; i++){
            array[i]=(int)(Math.random()*rango)+min;
       }
        return array;
    }
    public static int minArray(int array[]){
        int min=array[0];
        for(int i=0; i<array.length;i++){
            if(min>array[i]){
                min=array[i];
            }
        }
        return min;
    }
    /**
     * Este método nos devuelve la posición del array donde esta el valor mínimo del array
     * @param array el array al que se le busca el minimo
     * @return la posicion del minimo
     */
    public static int posminArray(int array[]){
        int posMin=0;
        for(int i=0; i<array.length;i++){
            if(array[posMin]>array[i]){
                posMin=i;
            }
        }
        return posMin;
    }
    /**
     * Con esto calculamos la posicion minima de la copia del Array
     * @param array
     * @param comienzoSubarray
     * @return 
     */
    public static int posminSubarray(int array[],int comienzoSubarray){
        int posMin=comienzoSubarray;
        for(int i=comienzoSubarray+1; i<array.length;i++){
            if(array[posMin]>array[i]){
                posMin=i;
            }
        }
        return posMin;
    }
    /**
     * Este método me da una copia exacta del array dado
     * @param array
     * @return 
     */
    public static int[] copiarArray(int array[]){
        int copia[]=new int [array.length];
        for (int i=0; i<array.length;i++){
            copia[i]=array[i];
        }
        return copia;
    }
    
    public static void main(String[] args) {
        int []aleatorios=arrayAleatorio(20,1,100);
        int[]copia=copiarArray(aleatorios);
        int posMinArray=posminSubarray(copia,0);
        int aux=aleatorios[posMinArray];
        
        aleatorios[0]=aleatorios[posMinArray];
        aleatorios[posMinArray]=aux;
    }
    
}
