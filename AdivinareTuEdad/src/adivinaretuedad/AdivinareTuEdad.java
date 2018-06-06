/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivinaretuedad;

import java.util.Scanner;

/**
 *
 * @author dam1a26
 */
public class AdivinareTuEdad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int añoDeNacimiento = 0;
        int añoActual = 0;
        int resultado = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el año en que nacistes:");
        añoDeNacimiento = sc.nextInt();
        System.out.println("Introduce el año en que estamos:");
        añoActual = sc.nextInt();
        if (añoDeNacimiento <= añoActual) {
            resultado = añoActual - añoDeNacimiento;
            System.out.println("Usted tiene " + resultado + " años (aproximadamente)");
        } else {
            System.out.println("ERROR: Los datos que has introducido son incorrectos");

        }

    }

}
