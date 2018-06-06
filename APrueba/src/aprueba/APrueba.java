/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprueba;

import java.util.Scanner;

/**
 *
 * @author dam1a26
 */
public class APrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        entropia();
    }
    private static void hola(){
    
        int numeroIntroducido = 0;
        int numeroAleatorio = (int) (Math.random() * 10);
        Scanner sc = new Scanner(System.in);
        while (numeroIntroducido!=numeroAleatorio)
        {
        System.out.println("Introduce un numero:");
        numeroIntroducido = sc.nextInt();
        if (numeroIntroducido > numeroAleatorio) {
            System.out.println("El numero que has elegido es mayor que el numero aleatorio");
        }
        if (numeroIntroducido < numeroAleatorio) {
            System.out.println("El numero que has elegido es menor que el numero aleatorio");
        }
        if (numeroIntroducido == numeroAleatorio) {
            System.out.println("Los dos numeros son iguales!!");
           
        }
        
        
        }
    
    
    
    }
    
    private static void entropia(){
    int numero = 1000000000;
    int resultado = 0;
    int explosion = 2;
    // int reduccion = 10;
    // int destruccion= 2;
        for (int i = 1; i < 1000000000; i++) {  
            resultado = numero-10;
            resultado = numero + explosion;
        }
    
    
    
    
    
    }
    
    
    
    
    

}
