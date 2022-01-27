/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author mafer
 */
import java.util.Scanner;
import java.lang.Math;
        
public class Esfera {
    double cirfurencia;
    double area;
    double volumen;
    double diametros;

    /**
     */
    public void setcircuferencia() 
    {
        Scanner teclado = new Scanner(System.in);
        double diametro;
        System.out.println("Dame el diametro del circulo:");
        diametro = teclado.nextDouble();
        cirfurencia = diametro * (3.1416);
        System.out.println("La circuferencia es:"+cirfurencia);
    }
    public void setarea()
    {   
        double area1,a;
        area1 = (4)*(3.1416);
        a = Math.pow(3,2);
        area = area1 * a;
        System.out.println("El area es:"+area);
        
    
    }
        public void setvolumen()
    {   
        double volumen1,volumen2;
        volumen1 = (4) * (3.1416);
        volumen2 = Math.pow(3,3);
        volumen = volumen1 * volumen2/3;
        
        System.out.println("El volumen es:"+volumen);
        
    
    }
        public void setdiametros()
    {
        diametros = (2) * (3);
        System.out.println("El diametro es:"+diametros);
        
    
    }
    public static void main(String[] args) {
        // TODO code application logic here
          Esfera ac1 = new Esfera();
       
          ac1.setcircuferencia();
          ac1.setarea();
          ac1.setvolumen();
          ac1.setdiametros();
    }
    
}
