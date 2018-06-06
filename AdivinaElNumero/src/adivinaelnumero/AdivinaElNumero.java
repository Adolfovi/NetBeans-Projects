/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivinaelnumero;

import java.util.Scanner;

/**
 *
 * @author dam1a26
 */
public class AdivinaElNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = (int) (Math.random() * 10);
        int numero = 0;
        System.out.println("Introduce un numero:");
        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();
        if (numero == a) {
            System.out.println("El numero que ha salido ha sido el: " + a + ", y tu has elegido el: " + numero + ". Enhorabuena, has acertado!");
        } else {
            System.out.println("El numero que ha salido ha sido el: " + a + ", y tu has elegido el: " + numero + ". Has fallado!");

        }

    }

}
