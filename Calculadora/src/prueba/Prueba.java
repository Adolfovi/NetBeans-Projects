/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;
import java.util.Scanner;
/**
 *
 * @author dam1a26
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String simbolo="";
        int numero1 = 0;
        int numero2 = 0;
        int resultado = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el simbolo:");
        simbolo=sc.nextLine();
        System.out.println("Introduce el primer numero:");
        numero1=sc.nextInt();
        System.out.println("Introduce el segundo numero:");
        numero2=sc.nextInt();
        
       
        if(simbolo.equals("+"))
        {resultado=numero1+numero2;}
        if(simbolo.equals("-"))
        {resultado=numero1-numero2;}
        if(simbolo.equals("*"))
        {resultado=numero1*numero2;}
        if(simbolo.equals("/"))
        {resultado=numero1/numero2;}
        System.out.println("El resultado es: " + resultado);
        
        
    }
    
}
