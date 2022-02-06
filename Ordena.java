
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author mafer
 */
public class Ordena {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int min = 1;
        int max = 100;
        int izq =0;
        int der = 0;
        int[] arreglo = new int[10];

        
        Random random = new Random();
        for (int x =0; x<= arreglo.length -1; x++){
            int valor = random.nextInt(min,max) + min;
            arreglo[x] = valor; 
        }   

        System.out.println(burbuja(arreglo));
       // System.out.println(quicksort(arreglo,izq,der));

        
    }    

    public static int burbuja(int [] arreglo){
        for (int x = arreglo.length -1; x>0;x--){
            for (int i=0; i<x;i++){
                if (arreglo[i]>arreglo[i+1]){
                    int p = arreglo[i];
                    arreglo[i] = arreglo [i+1];
                    arreglo[i+1]= p;
                }
            }
        }
        for (int x =0; x < arreglo.length; x++){
            System.out.println("Indice("+ x +")"+"valor("+ arreglo[x] +")");
        }   
        return 0;
    }
    
    public static int quicksort(int[]arreglo, int izq, int der){

          int pivote=arreglo[izq];
          int i=izq; 
          int j=der; 
          int aux;
          
          while(arreglo[i]>pivote)i++;
          while(arreglo[j]>pivote)i--;
          
          if(i>j){
              aux = arreglo[j];
              arreglo[j] = arreglo[i];
              arreglo[i] = aux;
              i++;
              j--;
          }
          if(j>i){
              aux = arreglo[i];
              arreglo[i] = arreglo[j];
              arreglo[j] = aux;
              i++;
              j--;
          }
        return 0;
    }
}
