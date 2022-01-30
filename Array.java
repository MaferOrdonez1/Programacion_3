/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array;
/**
 *
 * @author mafer
 */
import java.util.Random;

public class Array {

    public static void main(String[] args) {
    // TODO code application logic here 
        int min = 1;
        int max = 100;
        int[] arreglo = new int[10];
        
        Random random = new Random();
        for (int x =0; x<= arreglo.length -1; x++){
            int valor = random.nextInt(min,max) + min;
            arreglo[x] = valor; 
        }   
        for (int x =0; x<= arreglo.length -1; x++){
            System.out.println("Indice("+ x +")"+"valor("+ arreglo[x] +")");
        }
        
        
    }
}
