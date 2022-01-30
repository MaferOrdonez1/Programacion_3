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
    int arreglo[];
    
    
    public void Array(int tamaño){
        if (tamaño >0){
            arreglo = new int[tamaño];
        }else{
            arreglo = new int[10];
        }
    }
    public void fill(){
        int min = 1;
        int max = 100;
        int valor = 0;
        Random random = new Random();
        for (int x =0; x<= this.arreglo.length -1; x++){
            valor = random.nextInt(max+min) + min;
            this.arreglo[x] = valor;
        
        }
    
    }
    public void print(){
        for (int x =0; x<= this.arreglo.length -1; x++){
            System.out.println("Indice("+ x +")"+"valor("+ this.arreglo[x] +")");
        }
    
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
            Array ac1 = new Array();
            ac1.print();

    }
}
