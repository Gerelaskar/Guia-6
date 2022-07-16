/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggguia6fundamentales;

import java.util.Scanner;

/**
 *
 * @author elask
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        
       Scanner leer = new Scanner (System.in);
        float num;
        float doble;
        float triple;
        double raiz;
        System.out.println("Ingrese un numero ");
        num = leer.nextFloat();
        
        doble= 2*num;
        triple = 3*num;
        raiz = Math.sqrt(num);
        System.out.println("El doble de " +num + " es " +doble);
        System.out.println("El triple de " +num + " es " +triple);
        System.out.println("La raiz de " +num + " es " +raiz);
    }
}
