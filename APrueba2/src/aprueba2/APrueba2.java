/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprueba2;
import java.util.Scanner;
/**
 *
 * @author dam1a26
 */
public class APrueba2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
        int resultado = 0;
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce el primer numero:");
        a = sc.nextInt();
        System.out.println("Introduce el segundo numero:");
        b = sc.nextInt();
        System.out.println("Introduce el tercer numero:");
        c = sc.nextInt();
        resultado = a+b+c/3;
        System.out.println(resultado);
    }
    
}
